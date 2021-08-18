package com.springboot.springbootcrud.repository;

import com.springboot.springbootcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

