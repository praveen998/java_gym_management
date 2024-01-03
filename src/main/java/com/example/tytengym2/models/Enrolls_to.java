package com.example.tytengym2.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "enrolls_to")
public class Enrolls_to 

{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "et_id")
    private Long et_id;

    @OneToOne
    @JoinColumn(name = "pid")
    private Plan plan;

    @OneToOne
    @JoinColumn(name="userid")
    private Users users;

    @Column(name = "paid_date")
    private String paid_date;

    @Column(name = "expire")
    private String expire;

    @Column(name="paid_month")
    private int paid_month;

      public Long getEt_id() {
        return et_id;
    }

    public void setEt_id(Long et_id) {
        this.et_id = et_id;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getPaid_date() {
        return paid_date;
    }

    public void setPaid_date(String paid_date) {
        this.paid_date = paid_date;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    
    public String getPaid_month() {
        return Integer.toString(paid_month);
    }

    public void setPaid_month(int paid_month) {
        this.paid_month = paid_month;
    }


}
