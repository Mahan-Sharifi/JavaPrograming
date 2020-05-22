package com.company;

public class CompanyUser {
    private int Code;
    private String Name;
    private int Nationalcode;
    private String FatherName;
    private String Post;
    private int Salary;
    private String WorkExperience;

    public void setCode(int code) {
        Code = code;
    }

    public int getCode() {
        return Code;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setNationalcode(int nationalcode) {
        Nationalcode = nationalcode;
    }

    public int getNationalcode() {
        return Nationalcode;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getPost() {
        return Post;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setWorkExperience(String workExperience) {
        WorkExperience = workExperience;
    }

    public String getWorkExperience() {
        return WorkExperience;
    }
}
