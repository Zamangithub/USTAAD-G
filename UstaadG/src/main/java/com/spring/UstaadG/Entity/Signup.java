package com.spring.UstaadG.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name ="Sign_Up")
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;
    private String firstName;
    private String lastName;
    private String username;
    @Size(max = 11, min = 11)
    private String phoneNo;
    @Email
    private String email;
    private String password;
    private boolean isEnabled = true;
}
