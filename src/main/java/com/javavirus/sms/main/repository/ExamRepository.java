package com.javavirus.sms.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javavirus.sms.main.model.Exam;
import com.javavirus.sms.main.model.Student;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long>{

}
