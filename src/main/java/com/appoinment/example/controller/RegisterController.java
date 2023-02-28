package com.appoinment.example.controller;

import com.appoinment.example.entity.*;
import com.appoinment.example.repository.GenderRepo;
import com.appoinment.example.repository.PrefixGenderMappingRepo;
import com.appoinment.example.repository.PrefixRepo;
import com.appoinment.example.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RegisterController {
    @Autowired
    private GenderRepo genderRepo;

    @Autowired
    private PrefixGenderMappingRepo prefixGenderMappingRepo;

    @Autowired
    private PrefixRepo prefixRepo;

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender)
    {
        genderRepo.save(gender);
        return "Gender Save";
    }
    @PostMapping("savePrefix")
    public String saveGenderPrefix(@RequestBody Prefix prefix) {
        Prefix prefix1 = prefixRepo.save(prefix);
        PrefixGenderMappinfId prefixGenderMappinfId = new PrefixGenderMappinfId();
        prefixGenderMappinfId.setPrefixid(prefix1.getId());
        prefixGenderMappinfId.setGenderid(prefix1.getGender());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMappinfId.setPrefixid(prefix1.getId());
        prefixGenderMappinfId.setGenderid(Integer.parseInt(prefix1.getGender()));
        return "prefix saved";
    }


    @PostMapping("saveAppointment")
    public String saveAppointment(@RequestBody Registration registration){
        registrationRepo.save(registration);
        return "save Appointment";
    }

    @GetMapping("getById/{id}")
    public Optional<Registration> getById(@PathVariable Integer id){
        return registrationRepo.findById(id);
}

    }