package com.javavirus.sms.main.dto;

import java.util.Set;

import com.javavirus.sms.main.model.Exam;
import com.javavirus.sms.main.model.StudentMarks;

public class ExamDTO {

	private Long id;
	private String examName;
	private String examYear;
	private Set<StudentMarks> examMarksList;

	public Set<StudentMarks> getExamMarksList() {
		return examMarksList;
	}

	public void setExamMarksList(Set<StudentMarks> examMarksList) {
		this.examMarksList = examMarksList;
	}

	public ExamDTO() {
		super();
	}

	public ExamDTO(Exam exam) {
		super();
		this.id = exam.getId();
		this.examName = exam.getExamName();
		this.examYear = exam.getExamYear();
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
