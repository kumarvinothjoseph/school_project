package com.javavirus.sms.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javavirus.sms.main.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
