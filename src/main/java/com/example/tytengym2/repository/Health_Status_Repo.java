package com.example.tytengym2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.Health_Status;

@Repository
public interface Health_Status_Repo extends JpaRepository<Health_Status,Long>{
    
}
