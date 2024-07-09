package com.example.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long UserId;
    private String UserName;
    private String email;
    private String address;
    private  int number;
    private  String roll;
    private String status;
    private  int  CrateDate;

    public User(){

    }
    public User(Long UserId, String UserName, String email, String address, int number, String roll, String status, int CreateDate) {
        this.UserId=UserId;
        this.UserName=UserName;
        this.address=address;
        this.number=number;
        this.email=email;
        this.roll=roll;
        this.CrateDate=CreateDate;
        this.status=status;

    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCrateDate() {
        return CrateDate;
    }

    public void setCrateDate(int crateDate) {
        CrateDate = crateDate;
    }
}
