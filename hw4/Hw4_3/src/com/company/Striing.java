package com.company;
import java.util.Scanner;
public class Striing extends Exception {
    public Striing(String msg){
        super(msg);
    }
    public Striing(){}
    public static void String() throws Striing {
        String str;
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your String");
        int i;
        Integer j;
        String s = null;
        str = user.next();
        for (j = 0; j < 10; j++) {

            s = j.toString();



            if (str.contains(s)) {
                throw new Striing("error,We have digit");
            }

            }
        if(!str.contains(s)){
            System.out.println(str.length());
        }
    }

    }

