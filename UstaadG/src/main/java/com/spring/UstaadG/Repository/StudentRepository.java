package com.spring.UstaadG.Repository;

import com.spring.UstaadG.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
