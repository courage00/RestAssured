package com.example.demo.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @Column(name = "mid", unique = true, nullable = false, length = 50)
    private String mid;
    @Column(name = "email", unique = true, length = 50)
    private String email;
    @Column(name = "password",  length = 50)
    private String password;
    @Column(name = "first_name",  length = 50)
    private String firstName;
    @Column(name = "last_name",  length = 50)
    private String lastName;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;



    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}