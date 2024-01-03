package com.example.tytengym2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tytengym2.models.Users;
import com.example.tytengym2.repository.Enrolls_to_Repo;
import com.example.tytengym2.repository.UsersRepo;
import com.example.tytengym2.repository.Plan_Repo;

@Service
public class DashboardService<L> {

    private Enrolls_to_Repo enrolls_to_Repo;
    private UsersRepo usersRepo;
    private Plan_Repo plan_Repo;

    @Autowired
    public DashboardService(Enrolls_to_Repo enrolls_to_Repo,UsersRepo usersRepo,Plan_Repo plan_Repo)
    {
        this.enrolls_to_Repo=enrolls_to_Repo;
        this.usersRepo=usersRepo;
        this.plan_Repo=plan_Repo;
    }

    //return function for paid income this month
    public String customQuery()
    {
        int i=10;
        int total=0;
        List<com.example.tytengym2.models.Enrolls_to> entity = enrolls_to_Repo.customQuery(i);

        for (com.example.tytengym2.models.Enrolls_to e : entity)
        {
            total+=Integer.parseInt(e.getPlan().getAmount());        
        }
        return Integer.toString(total);
    }

    //return function for total members
    public String totalMembers()
    {
        System.out.println(usersRepo.totalMembers());
        return Long.toString(usersRepo.totalMembers());
    }
    
    //return function for join this month
    public String joinMonth()
    {
        String s="4";
        List<com.example.tytengym2.models.Users> entity=usersRepo.joinMonth(s);
        return Integer.toString(entity.size());
    }

    //return function for total plans
    public void toatalPlan()
    {
       String s = "yes";
       Long d=plan_Repo.totalPlan(s);
       System.out.println(d);

    }

    


}
