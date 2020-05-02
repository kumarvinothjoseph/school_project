package com.javavirus.sms.main.dto;

import com.javavirus.sms.main.model.Exam;
import com.javavirus.sms.main.model.Student;
import com.javavirus.sms.main.model.StudentMarks;


public class StudentMarksDTO {

	private Long id;
	private Student student;
	private Exam exam;
	private String tamil;
	private String english;
	private String maths;
	private String science;
	private String socialScience;
	private String other1;
	private String other2;
	private String total;
	private String rank;
	private String grade;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public StudentMarksDTO() {
		super();
	}

	public StudentMarksDTO(StudentMarks studentMarks) {
		super();
		this.id = studentMarks.getId();
		this.student = studentMarks.getStudent();
		this.exam = studentMarks.getExam();
		this.tamil = studentMarks.getTamil();
		this.english = studentMarks.getEnglish();
		this.maths = studentMarks.getMaths();
		this.science = studentMarks.getScience();
		this.socialScience = studentMarks.getSocialScience();
		this.other1 = studentMarks.getOther1();
		this.other2 = studentMarks.getOther2();
		this.rank = studentMarks.getRank();
		this.grade = studentMarks.getGrade();
		this.total = studentMarks.getTotal();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public String getTamil() {
		return tamil;
	}

	public void setTamil(String tamil) {
		this.tamil = tamil;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getSocialScience() {
		return socialScience;
	}

	public void setSocialScience(String socialScience) {
		this.socialScience = socialScience;
	}

	public String getOther1() {
		return other1;
	}

	public void setOther1(String other1) {
		this.other1 = other1;
	}

	public String getOther2() {
		return other2;
	}

	public void setOther2(String other2) {
		this.other2 = other2;
	}

}
