package com.javavirus.sms.main.service;

import java.util.List;

import com.javavirus.sms.main.dto.StudentMarksDTO;

public interface StudentMarksService {

	public void createOrUpdateStudentMarks(StudentMarksDTO studentMarkDTO);
	
	public List<StudentMarksDTO> getAllStudentMarks();
	
	public void deleteStudentMarks(Long id);
	
	public StudentMarksDTO editStudentMarks(Long id);

	public List<StudentMarksDTO> getAllSearchStudentMarks(String examId, String studentId);
	
}
