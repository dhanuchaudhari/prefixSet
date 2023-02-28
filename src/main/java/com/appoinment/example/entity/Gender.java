package com.appoinment.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gender {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String gender;
}
