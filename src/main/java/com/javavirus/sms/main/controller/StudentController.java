package com.javavirus.sms.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javavirus.sms.main.dto.ExamDTO;
import com.javavirus.sms.main.dto.StudentDTO;
import com.javavirus.sms.main.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("student", new StudentDTO());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createStudent(@ModelAttribute("student") StudentDTO studentDTO) {
		studentService.createOrUpdateStudent(studentDTO);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfStudent(Model model) {
		List<StudentDTO> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "studentList";
	}
	
	@PostMapping("/delete")
	public String deleteStudent(@RequestParam("id") String id) {
		studentService.deleteStudent(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editStudent(@RequestParam("id") String id, Map<String, Object> model) {
		StudentDTO studentDTO = studentService.editStudent(Long.parseLong(id));
		model.put("student", studentDTO);
		return "Registration";
	}
	
	
}
