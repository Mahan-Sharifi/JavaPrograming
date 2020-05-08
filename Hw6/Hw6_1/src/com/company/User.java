package com.company;

public class User {
    private String Username;
    private String RealName;
    private int Password;
    private int Age;
    private String Address;
    private int CellphoneNumber;
    private String EducationLevel;

    public String getUsername() {
        return Username;
    }

    public String getRealName() {
        return RealName;
    }

    public int getPassword() {
        return Password;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public int getCellphoneNumber() {
        return CellphoneNumber;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public User setUsername(String username) {
        Username = username;
        return this;
    }

    public User setRealName(String realName) {
        RealName = realName;
        return this;
    }

    public User setPassword(int password) {
        Password = password;
        return this;
    }

    public User setAge(int age) {
        Age = age;
        return this;
    }

    public User setAddress(String address) {
        Address = address;
        return this;
    }

    public User setCellphoneNumber(int cellphoneNumber) {
        CellphoneNumber = cellphoneNumber;
        return this;
    }

    public User setEducationLevel(String educationLevel) {
        EducationLevel = educationLevel;
        return this;
    }
}

