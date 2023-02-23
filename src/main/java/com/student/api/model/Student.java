package com.student.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentName;
	private String course;
	private Integer numCreds;
	private float gpa;
	private char track;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String Course) {
		course = Course;
	}

	public Integer getNumCreds() {
		return numCreds;
	}

	public void setNumCreds(Integer numCreds) {
		this.numCreds = numCreds;
	}

	public float getGPA() {
		return gpa;
	}

	public void setGPA(float gPA) {
		gpa = gPA;
	}

	public char getTrack() {
		return track;
	}

	public void setTrack(char track) {
		this.track = track;
	}
}
