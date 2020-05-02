package com.javavirus.sms.main.dto;

import com.javavirus.sms.main.model.Student;

public class StudentDTO {
	
	private Long id;
	private String fullName;
	private String nickName;
	private String fatherName;
	private String fatherOccupation;
	private String motherName;
	private String motherOccupation;
	private String dob;
	private String age;
	private String emailId;
	private String phoneNo;
	private String gender;
	private String address;
	private String standard;
	private String section;
	private String about;
	
	public StudentDTO() {
		super();
	}
	public StudentDTO(Student student) {
		super();
		this.id = student.getId();
		this.fullName = student.getFullName();
		this.nickName = student.getNickName();
		this.fatherName = student.getFatherName();
		this.fatherOccupation = student.getFatherOccupation();
		this.motherName = student.getMotherName();
		this.motherOccupation = student.getMotherOccupation();
		this.dob = student.getDob();
		this.age = student.getAge();
		this.emailId = student.getEmailId();
		this.phoneNo = student.getPhoneNo();
		this.gender = student.getGender();
		this.address = student.getAddress();
		this.standard = student.getStandard();
		this.section = student.getSection();
		this.about = student.getAbout();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
}
