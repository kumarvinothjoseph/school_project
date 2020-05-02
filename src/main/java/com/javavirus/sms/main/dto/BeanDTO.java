package com.javavirus.sms.main.dto;

import com.javavirus.sms.main.model.Exam;
import com.javavirus.sms.main.model.Student;
import com.javavirus.sms.main.model.StudentMarks;


public class BeanDTO {

	private Long id;
	private String studentid;
	private String examid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}
	
}
