package com.dropcrud.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dropcrud.org.entity.Department;
import com.dropcrud.org.entity.Designation;
import com.dropcrud.org.entity.Student;
import com.dropcrud.org.service.DepartmentService;
import com.dropcrud.org.service.DesignationService;
import com.dropcrud.org.service.StudentService;

import jakarta.persistence.EntityNotFoundException;
import lombok.Data;

@Data // studentService ra departmentService lai initialize garna constructor chaiyo
		// tei vayera
@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;

	private final DepartmentService departmentService;
	
	private final DesignationService designationService;

	@GetMapping
	public List<Student> findAll() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student findById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	public Student create(@RequestBody Student student) {
		Student createdStudent = studentService.addStudent(student);
		return createdStudent;
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student student) {
		Student updatedStudent = studentService.updateStudent(id, student);
		return updatedStudent;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentService.findAllDepartments();
	}

	@GetMapping("/designations")
	public List<Designation> getAllDesignations() {
		return designationService.findAllDesignations();
	}

}
