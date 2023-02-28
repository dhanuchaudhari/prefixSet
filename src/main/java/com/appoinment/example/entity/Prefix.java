package com.appoinment.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class Prefix {
@Id
    private int id;
    private String Prefix;

    @Transient
    private String gender;

}
