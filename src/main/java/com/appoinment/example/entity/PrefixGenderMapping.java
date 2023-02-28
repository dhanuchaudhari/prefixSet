package com.appoinment.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class PrefixGenderMapping implements Serializable {
    @EmbeddedId
   private PrefixGenderMappinfId prefixGenderMappinfId;
}
