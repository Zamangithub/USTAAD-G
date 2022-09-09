package com.spring.UstaadG.Controller;

import com.spring.UstaadG.Entity.Teacher;
import com.spring.UstaadG.Repository.TeacherRepository;
import com.spring.UstaadG.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class TeacherController {
    @Autowired
    public TeacherService teacherService;
    @Autowired
    public TeacherRepository teacherRepository;

    @GetMapping("/Teachers")
    public List<Teacher> getTeacher() {

        return teacherService.getTeacher();
    }

    @PostMapping("/Teachers")
    public Teacher addTeacher(@RequestBody Teacher teachers) {
        Teacher teacher = this.teacherService.addTeacher(teachers);
        return teacher;

    }

    //by ID
    @GetMapping("/Teachers/{id}")
    public Teacher getById(@PathVariable("id") Teacher teachers) {
        teacherService.getById(teachers);
        return teachers;

    }
    //For teacher Data update
    @PostMapping("/Teachers/{tid}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("tid") Long tid )
    {

        return teacherService.updateTeacher(teacher,tid);
     }
//To delete student
    @DeleteMapping("/Teachers/{tId}")
    public String deleteStudent (@PathVariable("tId") Long teacherId)
    {
        Teacher t = teacherRepository.getOne(teacherId);
        teacherRepository.delete(t);
        return "deleted";

    }
}
