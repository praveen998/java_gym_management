package com.example.tytengym2.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long userid;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "gender",nullable = false)
    private String gender;
    
    @Column(name = "mobile",nullable = false)
    private String mobile;

    @Column(name = "email",nullable = false)
    private String email;
    
    @Column(name = "dob",nullable = false)
    private String dob;

    @Column(name = "joining_date",nullable = false)
    private String joining_date;

    @Column(name="joining_month")
    private String joining_month;

    
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getJoining_month() {
        return joining_month;
    }

    public void setJoining_month(String joining_month) {
        this.joining_month = joining_month;
    }

}
