package com.student.studentSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentSpring.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
