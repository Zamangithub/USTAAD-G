package com.spring.UstaadG.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private String fname;
    private String gender;
    private byte[] cnic;
    @Size(max=11,min=11)
    private String phoneNo;
    private String email;
    private String Qualification;
    private String experience;
    private byte[] certificate;
    private String timing;
    private String subject;
    private String city;
    @Column(length= 200)
    private String message;
    @Column(length=150)
    private String address;
    private byte[] image;


}


