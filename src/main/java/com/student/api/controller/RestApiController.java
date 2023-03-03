package com.student.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.model.Student;
import com.student.api.service.StudentService;

@RestController
public class RestApiController {

	@Autowired
	private StudentService studentService;
	private static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	

	@GetMapping("/getstudents")
	public List<Student> fetchStudents() {
		logger.info("Inside retrieving students request endpoint");
		return studentService.getStudents();
	}

	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		logger.info("Inside adding student request endpoint");
		return studentService.saveStudent(student);
	}

	@PutMapping("/updatestudent/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId) {
		logger.info("Inside updating student request endpoint");
		return studentService.updateStudent(student, studentId);
	}

	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable("id") Long studentId) {
		studentService.deleteStudent(studentId);
		logger.info("Inside delete student request endpoint");
		return "Student with ID number " + studentId + " deleted succesfully";
	}

}
