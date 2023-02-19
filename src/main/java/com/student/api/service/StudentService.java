package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.model.Student;
import com.student.api.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {

		return studentRepository.save(student);

	}

	public List<Student> getStudents() {

		return studentRepository.findAll();
	}

	public Student updateStudent(Student student, Long studentId) {

		Student studentDetail = studentRepository.findById(studentId).get();

		studentDetail.setStudentName(student.getStudentName());
		studentDetail.setCourse(student.getCourse());
		studentDetail.setGPA(student.getGPA());
		studentDetail.setNumCreds(student.getNumCreds());
		studentDetail.setTrack(student.getTrack());
		return studentRepository.save(studentDetail);
	}

	public void deleteStudent(Long studentId) {

		studentRepository.deleteById(studentId);
	}

}
