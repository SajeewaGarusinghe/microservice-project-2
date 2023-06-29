package com.sajeewa.school.service;

import com.sajeewa.school.client.StudentClient;
import com.sajeewa.school.entity.School;
import com.sajeewa.school.repo.SchoolRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;
    private final StudentClient client;//try without final

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findAllSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId)
                .orElse(School.builder().name("NOT_FOUND").email("NOT_FOUND").build());

        //following will find all the students from the student microservice
        var students = client.findAllStudentsBySchool(schoolId);
        //following will create fullschoolresponse object combining school data and data fetched
        // from student service
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
