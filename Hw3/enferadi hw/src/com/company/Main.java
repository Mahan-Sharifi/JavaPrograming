package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) { //Sabt Ahval
        Scanner input=new Scanner(System.in);
        System.out.println("number of people");
        int n=input.nextInt();
        int i;
        for (i = 1; i <= n; i++) {

            Person user = new Person();
            System.out.format("Enter the first name of user%d,Please :",i);
            System.out.println();
            user.firstName = input.next();
            System.out.println();

            System.out.format("Enter the last name of user%d,Please :",i);
            System.out.println();
            user.lastName = input.next();
            System.out.println();

            System.out.format("Enter the Gender of user%d,Please :",i);
            System.out.println();
            user.gender = input.next();
            System.out.println();

            System.out.format("Enter the Birthplace of user%d,Please :",i);
            System.out.println();
            user.birthplace = input.next();
            System.out.println();

            System.out.format("Enter the first name of mother of user%d,Please :",i);
            System.out.println();
            user.firstNameOfMother = input.next();
            System.out.println();

            System.out.format("Enter the number certificate of of mother of user%d,Please :",i);
            System.out.println();
            user.numberOfBirthCertificateOfMother = input.nextInt();
            System.out.println();

            System.out.format("Enter the first name of father of user%d,Please :",i);
            System.out.println();
            user.firstNameOfFather = input.next();
            System.out.println();

            System.out.format("Enter the number certificate of of father of user%d,Please :",i);
            System.out.println();
            user.numberOfBirthCertificateOfFather = input.nextInt();
            System.out.println();

            user.informationOfPerson();

            user.informationOfParents();

            int a = 0;
            System.out.println("If person got married press 1 Otherwise press 2");
            a = input.nextInt();
            if (a == 1) {
                System.out.format("Enter the first name of spouse of user%d,Please :",i);
                System.out.println();
                user.firstNameOfspouse = input.next();
                System.out.println();

                System.out.format("Enter the number certificate of spouse of user%d,Please :",i);
                System.out.println();
                user.numberOfBirthCertificateOfspouse = input.nextInt();
                System.out.println();

                user.married();
            }


        }
    }
}
