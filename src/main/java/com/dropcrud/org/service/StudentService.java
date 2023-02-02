package com.dropcrud.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropcrud.org.entity.Student;
import com.dropcrud.org.repo.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Long id, Student student) {
		Student existingStudent = studentRepository.findById(id).orElse(null);
		if (existingStudent != null) {
			existingStudent.setName(student.getName());
			existingStudent.setDepartment(student.getDepartment());
			existingStudent.setDesignation(student.getDesignation());
			return studentRepository.save(existingStudent);
		}
		return null;
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
