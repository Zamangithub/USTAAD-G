package com.spring.UstaadG.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Scanner;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int marksId;
     int subE;
     int subU;
     int subM;
     int subS;
     int subI;
     int subP;
     int subSS;
     int subC;
     int totalMarks;
     float obtainedMarks;
     float percentage;

public int getTotal()
{

 return totalMarks = 800;

}
 public float getObtained()
 {
  return obtainedMarks = subC+subE+subSS+subI+subP +subU+subM+subS;
 }
 public float getPercentage()
 {
  /* Scanner scanner = new Scanner(System.in);
  System.out.println("Enter Total  subject:");
  int obtained = scanner.nextInt();*/
  return percentage = obtainedMarks/totalMarks*100;
 }
}
