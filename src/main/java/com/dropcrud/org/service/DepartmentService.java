package com.dropcrud.org.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dropcrud.org.entity.Department;
import com.dropcrud.org.repo.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> findDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }
}

