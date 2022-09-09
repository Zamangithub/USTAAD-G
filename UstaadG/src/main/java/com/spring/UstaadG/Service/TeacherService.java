package com.spring.UstaadG.Service;

import com.spring.UstaadG.Entity.Admin;
import com.spring.UstaadG.Entity.Teacher;
import com.spring.UstaadG.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    public TeacherRepository teacherRepository;
    public List<Teacher> getTeacher() {

        return teacherRepository.findAll();
    }

    //to Add Teacher in list
    public Teacher addTeacher(Teacher teacher) {

        //  return admin;
        return teacherRepository.save(teacher);
    }

    //For getting by id (Teacher)
    public Teacher getById(Teacher teachers) {

        //  return admin;
        return teacherRepository.save(teachers);
    }


    public Teacher updateTeacher(Teacher teacher,Long id) {
       // return teacher;

            teacherRepository.findById(id).isPresent();
            teacher.setId(id);
            teacherRepository.save(teacher);
            return teacher;

        }

    }

