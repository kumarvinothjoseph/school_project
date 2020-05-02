package com.javavirus.sms.main.service;

import java.util.List;

import com.javavirus.sms.main.dto.ExamDTO;
import com.javavirus.sms.main.model.Exam;

public interface ExamService {

	public void createOrUpdateExam(ExamDTO examDTO);
	
	public List<ExamDTO> getAllExams();
	
	public void deleteExam(Long id);
	
	public ExamDTO editExam(Long id);
	
	public Exam findOne(Long id);
	
}
