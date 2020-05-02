package com.javavirus.sms.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javavirus.sms.main.dto.ExamDTO;
import com.javavirus.sms.main.model.Exam;
import com.javavirus.sms.main.model.Student;
import com.javavirus.sms.main.repository.ExamRepository;
import com.javavirus.sms.main.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{
	
	@Autowired
	private ExamRepository examRepository;

	public void createOrUpdateExam(ExamDTO ExamDTO) {
		Exam exam = convertDtoToModel(ExamDTO);
		examRepository.save(exam);
	}
	
	public List<ExamDTO> getAllExams() {
		List<Exam> list = examRepository.findAll();
		List<ExamDTO> examList = list.stream()
	            .map(ExamDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return examList;
	}
	
	public void deleteExam(Long id) {
		examRepository.deleteById(id);
	}
	
	public ExamDTO editExam(Long id) {
		Exam exam = examRepository.getOne(id);
		return convertModelToDTO(exam);
	}
	
	public Exam findOne(Long id) {
		Exam exam = examRepository.getOne(id);
		return exam;
	}
	
	private Exam convertDtoToModel(ExamDTO examDTO) {
		Exam exam = new Exam();
		if (examDTO.getId() != null) {
			exam.setId(examDTO.getId());
		}
		exam.setExamName(examDTO.getExamName());
		exam.setExamYear(examDTO.getExamYear());
		return exam;
	}
	
	private ExamDTO convertModelToDTO(Exam exam) {
		ExamDTO examDTO = new ExamDTO();
		examDTO.setId(exam.getId());
		examDTO.setExamName(exam.getExamName());
		examDTO.setExamYear(exam.getExamYear());
		return examDTO;
	}

	
}
