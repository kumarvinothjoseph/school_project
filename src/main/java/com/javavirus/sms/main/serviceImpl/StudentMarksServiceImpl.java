package com.javavirus.sms.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javavirus.sms.main.dto.StudentMarksDTO;
import com.javavirus.sms.main.model.StudentMarks;
import com.javavirus.sms.main.repository.StudentMarksRepository;
import com.javavirus.sms.main.repository.StudentRepository;
import com.javavirus.sms.main.service.ExamService;
import com.javavirus.sms.main.service.StudentMarksService;
import com.javavirus.sms.main.service.StudentService;

@Service
public class StudentMarksServiceImpl implements StudentMarksService{
	
	@Autowired
	private StudentMarksRepository studentMarksRepository;
	@Autowired
	private StudentService studentService;
	@Autowired
	private ExamService examService;

	public void createOrUpdateStudentMarks(StudentMarksDTO studentMarksDTO) {
		StudentMarks studentMarks = convertDtoToModel(studentMarksDTO);
		studentMarksRepository.save(studentMarks);
	}
	
	public List<StudentMarksDTO> getAllStudentMarks() {
		List<StudentMarks> list = studentMarksRepository.findAll();
		List<StudentMarksDTO> studentMarksList = list.stream()
	            .map(StudentMarksDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return studentMarksList;
	}
	
	public void deleteStudentMarks(Long id) {
		studentMarksRepository.deleteById(id);
	}
	
	public StudentMarksDTO editStudentMarks(Long id) {
		StudentMarks studentMarks = studentMarksRepository.getOne(id);
		return convertModelToDTO(studentMarks);
	}
	
	/*public List<StudentMarksDTO> getAllSearchStudentMarks(String examId, String studentId) {
		System.out.println("exam"+examId);
		System.out.println("studentId"+studentId);
		List<StudentMarks> list = studentMarksRepository.findAll();
		List<StudentMarksDTO> studentMarksList = list.stream().filter(l -> (l.getStudent().getId().equals(studentId) &&
				l.getExam().getId().equals(examId)))
	            .map(StudentMarksDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return studentMarksList;
	}*/
	public List<StudentMarksDTO> getAllSearchStudentMarks(String examId, String studentId) {
		List<StudentMarks> list = studentMarksRepository.findAll();
		List<StudentMarksDTO> studentMarksList = list.stream().filter(l -> (l.getStudent().getId()==Integer.parseInt(studentId) &&
				l.getExam().getId()==Integer.parseInt(examId)))
	            .map(StudentMarksDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return studentMarksList;
	}
	
	private StudentMarks convertDtoToModel(StudentMarksDTO studentMarksDTO) {
		StudentMarks studentMarks = new StudentMarks();
		if (studentMarksDTO.getId() != null) {
			studentMarks.setId(studentMarksDTO.getId());
		}
		studentMarks.setStudent(studentService.findOne(studentMarksDTO.getStudent().getId()));
		studentMarks.setExam(examService.findOne(studentMarksDTO.getExam().getId()));
		studentMarks.setEnglish(studentMarksDTO.getEnglish());
		studentMarks.setMaths(studentMarksDTO.getMaths());
		studentMarks.setOther1(studentMarksDTO.getOther1());
		studentMarks.setOther2(studentMarksDTO.getOther2());
		studentMarks.setScience(studentMarksDTO.getScience());
		studentMarks.setSocialScience(studentMarksDTO.getSocialScience());
		studentMarks.setTamil(studentMarksDTO.getTamil());
		studentMarks.setTotal(studentMarksDTO.getTotal());
		studentMarks.setGrade(studentMarksDTO.getGrade());
		studentMarks.setRank(studentMarksDTO.getRank());
		return studentMarks;
	}
	
	private StudentMarksDTO convertModelToDTO(StudentMarks studentMarks) {
		StudentMarksDTO studentMarksDTO = new StudentMarksDTO();
		studentMarksDTO.setId(studentMarks.getId());
		studentMarksDTO.setStudent(studentMarks.getStudent());
		studentMarksDTO.setExam(studentMarks.getExam());
		studentMarksDTO.setEnglish(studentMarks.getEnglish());
		studentMarksDTO.setMaths(studentMarks.getMaths());
		studentMarksDTO.setOther1(studentMarks.getOther1());
		studentMarksDTO.setOther2(studentMarks.getOther2());
		studentMarksDTO.setScience(studentMarks.getScience());
		studentMarksDTO.setSocialScience(studentMarks.getSocialScience());
		studentMarksDTO.setTamil(studentMarks.getTamil());
		studentMarksDTO.setRank(studentMarks.getRank());
		studentMarksDTO.setGrade(studentMarks.getGrade());
		studentMarksDTO.setTotal(studentMarks.getTotal());
		return studentMarksDTO;
	}


	
}
