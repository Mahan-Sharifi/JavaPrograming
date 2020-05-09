package com.company;

import java.util.Scanner;

public class Person extends ParentsOfPeson{
    public String firstName;
    public String lastName;
    public String gender;
    public String birthplace;
    public void informationOfPerson(){
        System.out.println("the first name is "+firstName);
        System.out.println();
        System.out.println("the last name is "+lastName);
        System.out.println();
        System.out.println("the gender is "+gender);
        System.out.println();
        System.out.println("the birthplace is "+birthplace);
        System.out.println();
    }
    public String firstNameOfspouse;
    public int numberOfBirthCertificateOfspouse;
    public void married(){
        System.out.println("the first name of spouse is "+firstNameOfspouse);
        System.out.println();
        System.out.println("the number of birth certificate is "+numberOfBirthCertificateOfspouse);
        System.out.println();

    }

}
