package com.dropcrud.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dropcrud.org.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}

