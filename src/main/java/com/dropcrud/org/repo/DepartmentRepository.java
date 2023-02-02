package com.dropcrud.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dropcrud.org.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}


