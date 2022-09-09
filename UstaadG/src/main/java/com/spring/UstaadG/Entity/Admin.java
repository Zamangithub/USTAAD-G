package com.spring.UstaadG.Entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private String fname;
    @Column
    @Size(max = 11, min = 11)
    private String phoneNo;
    @Email
    private String email;
    @Column(length = 150)
    private String address;
    @Column(name = "admin_image",length= 1000000)
    private String base64;
    // private byte[] aimage;


}

