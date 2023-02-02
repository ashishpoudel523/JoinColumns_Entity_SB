package com.dropcrud.org.service;

import java.util.List;

import com.dropcrud.org.entity.Student;

public interface StudentServiceInterface {
	List<Student> getAllStudents();

	Student getStudentById(Long id);

	Student addStudent(Student student);

	Student updateStudent(Long id, Student student);

	void deleteStudent(Long id);
}



