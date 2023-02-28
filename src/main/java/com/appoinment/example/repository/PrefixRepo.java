package com.appoinment.example.repository;

import com.appoinment.example.entity.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixRepo extends JpaRepository<Prefix,Integer> {
}
