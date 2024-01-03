package com.example.tytengym2.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="user_timetable")
public class User_timetable 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    
    @OneToOne
    @JoinColumn(name = "userid")
    private Users users;


    @OneToOne
    @JoinColumn(name="tid")
    private Timetable tid;


    public Users getUsers() {
        return users;
    }


    public void setUsers(Users users) {
        this.users = users;
    }


    public Timetable getTid() {
        return tid;
    }


    public void setTid(Timetable tid) {
        this.tid = tid;
    }

    

}
