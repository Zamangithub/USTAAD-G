package com.spring.UstaadG.Repository;

import com.spring.UstaadG.Entity.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMarksRepository extends JpaRepository<StudentMarks,Integer> {
}
