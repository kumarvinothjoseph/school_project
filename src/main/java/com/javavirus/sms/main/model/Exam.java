package com.javavirus.sms.main.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="exam_name")
	private String examName;
	
	@Column(name="exam_year")
	private String examYear;

	@OneToMany(mappedBy="exam")
	private Set<StudentMarks> examMarksList;
	
	public Set<StudentMarks> getExamMarksList() {
		return examMarksList;
	}

	public void setExamMarksList(Set<StudentMarks> examMarksList) {
		this.examMarksList = examMarksList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamYear() {
		return examYear;
	}

	public void setExamYear(String examYear) {
		this.examYear = examYear;
	}
	
}
