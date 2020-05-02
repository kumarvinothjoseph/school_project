package com.javavirus.sms.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks")
public class StudentMarks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "exam_id")
	private Exam exam;

	@Column(name = "tamil")
	private String tamil;

	@Column(name = "english")
	private String english;

	@Column(name = "maths")
	private String maths;

	@Column(name = "science")
	private String science;

	@Column(name = "social_science")
	private String socialScience;

	@Column(name = "other1")
	private String other1;

	@Column(name = "other2")
	private String other2;
	
	@Column(name = "total")
	private String total;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "rank")
	private String rank;

	public StudentMarks() {
		super();
	}

	public StudentMarks(Long id, Student student, Exam exam, String tamil, String english, String maths, String science,
			String socialScience, String other1, String other2, String total, String grade, String rank) {
		super();
		this.id = id;
		this.student = student;
		this.exam = exam;
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.socialScience = socialScience;
		this.other1 = other1;
		this.other2 = other2;
		this.total = total;
		this.grade = grade;
		this.rank = rank;
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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
