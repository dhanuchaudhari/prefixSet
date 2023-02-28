package com.appoinment.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String Fname;
    private String Lname;
    private String PreFix;
    private String gender;

}
