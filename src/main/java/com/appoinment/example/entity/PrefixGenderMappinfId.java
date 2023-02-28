package com.appoinment.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class PrefixGenderMappinfId implements Serializable {
    private int prefixid;
    private int genderid;
}
