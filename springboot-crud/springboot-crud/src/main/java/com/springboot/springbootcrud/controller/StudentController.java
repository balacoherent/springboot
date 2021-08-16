package com.springboot.springbootcrud.controller;


import com.springboot.springbootcrud.baseresponse.BaseResponse;
import com.springboot.springbootcrud.dto.StudentDto;
import com.springboot.springbootcrud.model.Student;
import com.springboot.springbootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public BaseResponse display(@RequestBody StudentDto studentDto)
    {
        return studentService.adddetail(studentDto);
    }

    @GetMapping("/getAll")
    public List<Student> list() {
        return studentService.listAll();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/update")
    public BaseResponse updatedetail(@RequestBody StudentDto studentDto) {
        return studentService.updatedetail(studentDto);
    }

    @DeleteMapping("/Delete/{id}")
    public BaseResponse deletedetail(@PathVariable int id) {

        return studentService.deletedetail(id);
    }

}