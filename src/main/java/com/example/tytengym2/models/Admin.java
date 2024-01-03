package com.example.tytengym2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name="aid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String Full_name;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }


    
}
