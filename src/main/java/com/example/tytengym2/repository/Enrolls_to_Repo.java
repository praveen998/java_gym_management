package com.example.tytengym2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.Enrolls_to;

@Repository
public interface Enrolls_to_Repo extends JpaRepository<Enrolls_to,Long>{
    
    @Query("SELECT e FROM Enrolls_to e WHERE e.paid_month = :value")
    List<Enrolls_to> customQuery(@Param("value") int i);

}
