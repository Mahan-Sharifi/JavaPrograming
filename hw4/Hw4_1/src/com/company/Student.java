package com.company;
import java.util.Scanner;
public class Student extends Exception {
    public Student(String msg) {
        super(msg);
    }

    public Student() {
    }
    public String name;
    public String family;
    public String password;
    Scanner user = new Scanner(System.in);

    int i;
    Integer j;
    String s = null;




    public void StringName() throws Student {
        System.out.println("Please enter your Name");
        name = user.next();
        for (j = 0; j < 10; j++) {

            s = j.toString();


            if (name.contains(s)) {
                throw new Student("error,We have digit in the name");
            }


        }
    }
    public void StringFamily() throws Student {
        System.out.println("Please enter your family");
        family = user.next();
        for (j = 0; j < 10; j++) {

            s = j.toString();



            if (family.contains(s)) {
                throw new Student("error,We have digit in the family");
            }

        }
    }
    public void StringPassword() throws Student {
        System.out.println("Please enter your password");
        password = user.next();
       if(password.length()<4){
           throw new Student("the password must be 4 letters or digits or more than 4");
       }
    }
}
