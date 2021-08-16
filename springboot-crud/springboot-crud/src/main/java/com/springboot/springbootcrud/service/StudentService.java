package com.springboot.springbootcrud.service;


import com.springboot.springbootcrud.baseresponse.BaseResponse;
import com.springboot.springbootcrud.dto.StudentDto;
import com.springboot.springbootcrud.model.Student;
import com.springboot.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listAll() {
        return studentRepository.findAll();
    }
    public BaseResponse adddetail(StudentDto studentDto)
    {
        Student dto=new Student();
        BaseResponse baseResponse=new BaseResponse();
        dto.setName(studentDto.getName());
        dto.setAddress(studentDto.getAddress());
        studentRepository.save(dto);
        baseResponse.setData(dto);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("Success");
        return baseResponse;
    }

    public BaseResponse deletedetail(int id) {
        BaseResponse baseResponse = new BaseResponse();
        studentRepository.deleteById(id);
        baseResponse.setData(id);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("Student detail deleted successfully");
        return baseResponse;

    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);

}
   public BaseResponse updatedetail(StudentDto studentDto){
        BaseResponse baseResponse = new BaseResponse();
        Student existstudent = studentRepository.findById(studentDto.getId()).orElse(null);
        existstudent.setId(studentDto.getId());
        existstudent.setName(studentDto.getName());
        existstudent.setAddress(studentDto.getAddress());
        studentRepository.save(existstudent);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("Student updated detail successfully");
        baseResponse.setData(existstudent);
        return baseResponse;
   }

}
