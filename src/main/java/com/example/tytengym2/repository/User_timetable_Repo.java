package com.example.tytengym2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.User_timetable;

@Repository
public interface User_timetable_Repo extends JpaRepository<User_timetable,Long> {
    
}
