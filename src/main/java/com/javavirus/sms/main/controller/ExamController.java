package com.javavirus.sms.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javavirus.sms.main.dto.ExamDTO;
import com.javavirus.sms.main.service.ExamService;

@Controller
public class ExamController {

	@Autowired
	private ExamService examService;
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/examregistration")
	public String examRegistration(Map<String, Object> model) {
		model.put("exam", new ExamDTO());
		return "examRegistration";
	}
	
	@PostMapping("/examhome")
	public String createExam(@ModelAttribute("exam") ExamDTO examDTO) {
		examService.createOrUpdateExam(examDTO);
		return "redirect:/examlist";	
	}
	
	@GetMapping("/examlist")
	public String listOfExam(Model model) {
		List<ExamDTO> examList = examService.getAllExams();
		model.addAttribute("examList", examList);
		return "examList";
	}
	
	@PostMapping("/examdelete")
	public String deleteExam(@RequestParam("id") String id) {
		examService.deleteExam(Long.parseLong(id));
		return "redirect:/examlist";		
	}
	
	@GetMapping("/examedit")
	public String editExam(@RequestParam("id") String id, Map<String, Object> model) {
		ExamDTO examDTO = examService.editExam(Long.parseLong(id));
		model.put("exam", examDTO);
		return "examRegistration";
	}
	
}
