package com.spring.UstaadG.Service;

import com.spring.UstaadG.Entity.Admin;
import com.spring.UstaadG.Entity.StudentMarks;
import com.spring.UstaadG.Repository.StudentMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {
    @Autowired
    public StudentMarksRepository studentMarksRepository;
    //to Add admin
    public StudentMarks addMark(StudentMarks mark) {

        return studentMarksRepository.save(mark);
    }
}
