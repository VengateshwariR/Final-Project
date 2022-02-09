package com.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity
{
	@Column
	private String studentName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column
	private String studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public StudentEntity(String studentName, int studentId, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAddress = studentAddress;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentEntity [studentName=" + studentName + ", studentId=" + studentId + ", studentAddress="
				+ studentAddress + "]";
	}
	

}
