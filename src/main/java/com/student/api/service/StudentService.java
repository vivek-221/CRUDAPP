package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.exception.StudentNotFoundException;
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

		Student studentDetail = null;
		try {
			studentDetail = studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(
					"Student with the id => " + studentId + " do not have an old entry to update"));

			if (student.getStudentName() != null) {
				studentDetail.setStudentName(student.getStudentName());
			}
			if (student.getCourse() != null) {
				studentDetail.setCourse(student.getCourse());
			}
			studentDetail.setGPA(student.getGPA());
			if (student.getNumCreds() != null) {
				studentDetail.setNumCreds(student.getNumCreds());
			}
			studentDetail.setTrack(student.getTrack());
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		return studentRepository.save(studentDetail);
	}

	public void deleteStudent(Long studentId) throws StudentNotFoundException {

		Student student = studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(
				"Student with the given id => " + studentId + " not exists to delete"));
		studentRepository.delete(student);
	}
}
