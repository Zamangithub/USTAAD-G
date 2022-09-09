package com.spring.UstaadG.Entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String fname;
    private String gender;
    private String age;
    @Column(name = "S_Class")
    private String sclas;
    private String subject;
    @Column(name = "school_name")
    private String school;
    private String city;
    @Column(length= 150)
    private String address;
    @Column(length= 200)
    private String message;
    @Lob
    private byte[] image;

}
