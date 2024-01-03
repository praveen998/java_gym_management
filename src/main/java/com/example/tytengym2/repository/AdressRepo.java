package com.example.tytengym2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.Address;

@Repository
public interface AdressRepo extends JpaRepository<Address,Long>
{
    
}
