package com.javavirus.sms.main.service;

import java.util.List;

import com.javavirus.sms.main.dto.StudentDTO;
import com.javavirus.sms.main.model.Student;

public interface StudentService {

	public void createOrUpdateStudent(StudentDTO studentDTO);
	
	public List<StudentDTO> getAllStudents();
	
	public void deleteStudent(Long id);
	
	public StudentDTO editStudent(Long id);
	
	public Student findOne(Long id);
	
}
