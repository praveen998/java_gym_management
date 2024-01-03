package com.example.tytengym2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.tytengym2.models.Plan;

@Repository
public interface Plan_Repo extends JpaRepository<Plan,Long> {

    @Query("select count(u) from Plan u where u.active = :yes")
    public Long totalPlan(@Param("yes") String yes);

}
