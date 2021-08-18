package com.springboot.springbootcrud.service;


import com.springboot.springbootcrud.model.Student;
import com.springboot.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public void save(Student student){
       studentRepository.save(student);
}

     public Student get(Integer id){
        return studentRepository.findById(id).get();
}
    public List<Student> listAll(){
        return studentRepository.findAll();
    }

    public void delete(Integer id){
         studentRepository.deleteById(id);
}

}
