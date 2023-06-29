package com.sajeewa.school.repo;

import com.sajeewa.school.entity.School;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
