package com.company;
import java.util.Scanner;
public class PersonalInformation extends Exception {

    public PersonalInformation(String msg) {
        super(msg);
    }



    public PersonalInformation(){}
    public static void personalInformation() throws PersonalInformation {
        int i;
        int age1,age2;
        String name1,name2;
        String family1,family2;
        Scanner user1=new Scanner(System.in);
        System.out.format("The age of user1");
        System.out.println();
        age1=user1.nextInt();
        System.out.format("The name of user1");
        System.out.println();
        name1=user1.next();
        System.out.format("The family of user1");
        System.out.println();
        family1=user1.next();

        Scanner user2=new Scanner(System.in);
        System.out.format("The age of user2");
        System.out.println();
        age2=user2.nextInt();
        System.out.format("The name of user2");
        System.out.println();
        name2=user2.next();
        System.out.format("The family of user2");
        System.out.println();
        family2=user2.next();

        if(age1==age2 && name1.equals(name2) && family1.equals(family2)){
            throw new PersonalInformation("the Informations are repeatable");
        }

    }
}
