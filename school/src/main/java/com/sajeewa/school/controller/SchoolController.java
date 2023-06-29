package com.sajeewa.school.controller;

import com.sajeewa.school.entity.School;
import com.sajeewa.school.service.SchoolService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@CrossOrigin
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school) {
        service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllStudents() {
        return ResponseEntity.ok(service.findAllSchools());
    }
}