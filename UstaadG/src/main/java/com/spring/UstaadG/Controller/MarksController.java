package com.spring.UstaadG.Controller;

import com.spring.UstaadG.Entity.Admin;
import com.spring.UstaadG.Entity.StudentMarks;
import com.spring.UstaadG.Repository.StudentMarksRepository;
import com.spring.UstaadG.Service.AdminService;
import com.spring.UstaadG.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MarksController {

    @Autowired
    private MarksService marksService;
    @Autowired
    public StudentMarksRepository studentMarksRepository;
    @PostMapping("/marks")
    public StudentMarks addMarks(@RequestBody StudentMarks marks) {

         marks.getObtained();
         marks.getTotal();
         marks.getPercentage();
       StudentMarks mark = this.marksService.addMark(marks);

        return mark;

    }
}
