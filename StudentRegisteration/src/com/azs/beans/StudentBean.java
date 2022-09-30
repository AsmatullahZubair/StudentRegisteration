package com.azs.beans;

import java.io.Serializable;
import java.util.Random;

public class StudentBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int StudentId;
	private String studentName;
	private String studentRollNo;
	private String studentSection;
	private String studentBatch;
	private String studentGender;
	private String studentQualification;
	private String studentAddress;
	private String studentCountry;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentBatch() {
		return studentBatch;
	}
	public void setStudentBatch(String studentBatch) {
		this.studentBatch = studentBatch;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	public int generateId() {
		Random randomNumber = new Random(3);
		return randomNumber.nextInt();
	}
}
