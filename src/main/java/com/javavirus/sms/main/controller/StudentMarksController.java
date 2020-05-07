package com.javavirus.sms.main.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javavirus.sms.main.dto.BeanDTO;
import com.javavirus.sms.main.dto.ExamDTO;
import com.javavirus.sms.main.dto.StudentDTO;
import com.javavirus.sms.main.dto.StudentMarksDTO;
import com.javavirus.sms.main.model.Student;
import com.javavirus.sms.main.service.ExamService;
import com.javavirus.sms.main.service.StudentMarksService;
import com.javavirus.sms.main.service.StudentService;

@Controller
public class StudentMarksController {

	@Autowired
	private StudentMarksService studentMarksService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private ExamService examService;
	
	@GetMapping("/markregistration")
	public String reg(Map<String, Object> model) {
		model.put("studentMarks", new StudentMarksDTO());
		 Map<Long, String> studentList = new HashMap<>();
		 Map<Long, String> examList = new HashMap<>();
		 List<StudentDTO> studentListDTO = studentService.getAllStudents();
		 for(StudentDTO studentDTO : studentListDTO) {
			 studentList.put(studentDTO.getId(), studentDTO.getFullName());
		 }
		 List<ExamDTO> examListDTO = examService.getAllExams();
		 for(ExamDTO examDTO : examListDTO) {
			 examList.put(examDTO.getId(), examDTO.getExamName());
		 }
		 model.put("studentObjs",studentList);
		 model.put("examObjs",examList);
		 
		return "markRegistration";
	}
	
	@PostMapping("/markhome")
	public String createStudentMarks(@ModelAttribute("studentMarks") StudentMarksDTO studentMarksDTO) {
		studentMarksService.createOrUpdateStudentMarks(studentMarksDTO);
		return "redirect:/marklist";	
	}
	
	@GetMapping("/marklist")
	public String listOfStudentMarks(Model model) {
		List<StudentMarksDTO> studentMarksList = studentMarksService.getAllStudentMarks();
		List<StudentDTO> studentList = studentService.getAllStudents();
		List<ExamDTO> examList = examService.getAllExams();
		model.addAttribute("studentMarksList", studentMarksList);
		model.addAttribute("studentList", studentList);
		model.addAttribute("examList", examList);
		return "studentMarksList";
	}
	
	@PostMapping("/markdelete")
	public String deleteStudentMarks(@RequestParam("id") String id) {
		studentMarksService.deleteStudentMarks(Long.parseLong(id));
		return "redirect:/marklist";		
	}
	
	@GetMapping("/markedit")
	public String editStudentMarks(@RequestParam("id") String id, Map<String, Object> model) {
		StudentMarksDTO studentMarksDTO = studentMarksService.editStudentMarks(Long.parseLong(id));
		model.put("studentMarks", studentMarksDTO);
		
		Map<Long, String> studentList = new HashMap<>();
		 Map<Long, String> examList = new HashMap<>();
		 List<StudentDTO> studentListDTO = studentService.getAllStudents();
		 for(StudentDTO studentDTO : studentListDTO) {
			 studentList.put(studentDTO.getId(), studentDTO.getFullName());
		 }
		 List<ExamDTO> examListDTO = examService.getAllExams();
		 for(ExamDTO examDTO : examListDTO) {
			 examList.put(examDTO.getId(), examDTO.getExamName());
		 }
		 model.put("studentObjs",studentList);
		 model.put("examObjs",examList);
		 
		return "markRegistration";
	}
	
	@PostMapping("/marklistSearch")
	public String listOfStudentMarksSearch(@ModelAttribute("beandto") BeanDTO beanDTO,Model model) {
		List<StudentDTO> studentList = studentService.getAllStudents();
		List<ExamDTO> examList = examService.getAllExams();
		if(beanDTO.getExamid()==null) {
			beanDTO.setExamid(examList.get(0).getId().toString());
		}
		if(beanDTO.getStudentid()==null) {
			beanDTO.setStudentid(studentList.get(0).getId().toString());
		}
		//for default and previous selected options to be first  forEach(student -> {
			// change this logic into any oth.er service class
		List<StudentDTO> selectedStudent = studentList.stream().filter(student ->(student.getId()==Integer.parseInt(beanDTO.getStudentid())))
	            .collect(Collectors.toCollection(ArrayList::new));
		studentList.removeAll(selectedStudent);
		selectedStudent.addAll(studentList);
		List<ExamDTO> selectedexam = examList.stream().filter(exam ->(exam.getId()==Integer.parseInt(beanDTO.getExamid())))
	            .collect(Collectors.toCollection(ArrayList::new));
		examList.removeAll(selectedexam);
		selectedexam.addAll(examList);
		List<StudentMarksDTO> studentMarksList = studentMarksService.getAllSearchStudentMarks(beanDTO.getExamid(), beanDTO.getStudentid());
		model.addAttribute("studentMarksList", studentMarksList);
		model.addAttribute("studentList", selectedStudent);
		model.addAttribute("examList", selectedexam);
		return "studentMarksList";
	}
	
	
	
}
