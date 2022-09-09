package com.spring.UstaadG.Controller;

import com.spring.UstaadG.Entity.Student;
import com.spring.UstaadG.Repository.StudentRepository;
import com.spring.UstaadG.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class StudentController {
    @Autowired
    public StudentService studentService;
    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/Students")
    public List<Student> getStudent() {

        return studentService.getStudent();
    }

    @PostMapping("/Students")
    public Student addStudent(@RequestBody Student students) {
        Student student = this.studentService.addStudent(students);
        return student;

    }

    //by ID
    @GetMapping("/Students/{sid}")
    public Student getById(@PathVariable("sid") Student students) {
        studentService.getById(students);
        return students;

    }

//To delete student
    @DeleteMapping("/Students/{sId}")
    public String deleteStudent (@PathVariable("sId") Long studentId)
    {
        Student s = studentRepository.getOne(studentId);
        studentRepository.delete(s);
        return "deleted";

    }

}
