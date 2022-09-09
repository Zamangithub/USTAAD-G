package com.spring.UstaadG.Service;


import com.spring.UstaadG.Entity.Admin;
import com.spring.UstaadG.Entity.Student;
import com.spring.UstaadG.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getStudent() {

        return studentRepository.findAll();
    }

    //to Add Student in list
    public Student addStudent(Student student) {

        //  return admin;
        return studentRepository.save(student);
    }

    //For getting by id (Student)
    public Student getById(Student student) {

        return studentRepository.save(student);
    }

}
