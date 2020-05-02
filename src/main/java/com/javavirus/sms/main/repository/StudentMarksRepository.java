package com.javavirus.sms.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javavirus.sms.main.model.StudentMarks;

@Repository
public interface StudentMarksRepository extends JpaRepository<StudentMarks, Long>{

}
