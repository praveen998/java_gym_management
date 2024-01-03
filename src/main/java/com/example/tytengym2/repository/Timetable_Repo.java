package com.example.tytengym2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.Timetable;

@Repository
public interface Timetable_Repo extends JpaRepository<Timetable,Long>{
    
}
