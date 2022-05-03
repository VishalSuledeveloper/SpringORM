package net.spring.com.SpringORMA5.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int StudentId;
	private String StudentName;
	private String StudentCity;
	public Student(int studentId, String studentName, String studentCity) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentCity = studentCity;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
