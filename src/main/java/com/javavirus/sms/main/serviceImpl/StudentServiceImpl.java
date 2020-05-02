package com.javavirus.sms.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javavirus.sms.main.dto.StudentDTO;
import com.javavirus.sms.main.model.Student;
import com.javavirus.sms.main.repository.StudentRepository;
import com.javavirus.sms.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	public void createOrUpdateStudent(StudentDTO studentDTO) {
		Student student = convertDtoToModel(studentDTO);
		studentRepository.save(student);
	}
	
	public List<StudentDTO> getAllStudents() {
		List<Student> list = studentRepository.findAll();
		List<StudentDTO> studentList = list.stream()
	            .map(StudentDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return studentList;
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
	public StudentDTO editStudent(Long id) {
		Student student = studentRepository.getOne(id);
		return convertModelToDTO(student);
	}
	
	public Student findOne(Long id) {
		Student student = studentRepository.getOne(id);
		return student;
	}
	
	private Student convertDtoToModel(StudentDTO studentDTO) {
		Student student = new Student();
		if (studentDTO.getId() != null) {
			student.setId(studentDTO.getId());
		}
		student.setAbout(studentDTO.getAbout());
		student.setAddress(studentDTO.getAddress());
		student.setAge(studentDTO.getAge());
		student.setDob(studentDTO.getDob());
		student.setEmailId(studentDTO.getEmailId());
		student.setFatherName(studentDTO.getFatherName());
		student.setFatherOccupation(studentDTO.getFatherOccupation());
		student.setFullName(studentDTO.getFullName());
		student.setGender(studentDTO.getGender());
		student.setMotherName(studentDTO.getMotherName());
		student.setMotherOccupation(studentDTO.getMotherOccupation());
		student.setNickName(studentDTO.getNickName());
		student.setPhoneNo(studentDTO.getPhoneNo());
		student.setSection(studentDTO.getSection());
		student.setStandard(studentDTO.getStandard());
		return student;
	}
	
	private StudentDTO convertModelToDTO(Student student) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(student.getId());
		studentDTO.setAbout(student.getAbout());
		studentDTO.setAddress(student.getAddress());
		studentDTO.setAge(student.getAge());
		studentDTO.setDob(student.getDob());
		studentDTO.setEmailId(student.getEmailId());
		studentDTO.setFatherName(student.getFatherName());
		studentDTO.setFatherOccupation(student.getFatherOccupation());
		studentDTO.setFullName(student.getFullName());
		studentDTO.setGender(student.getGender());
		studentDTO.setMotherName(student.getMotherName());
		studentDTO.setMotherOccupation(student.getMotherOccupation());
		studentDTO.setNickName(student.getNickName());
		studentDTO.setPhoneNo(student.getPhoneNo());
		studentDTO.setSection(student.getSection());
		studentDTO.setStandard(student.getStandard());
		
		return studentDTO;
	}

	
}
