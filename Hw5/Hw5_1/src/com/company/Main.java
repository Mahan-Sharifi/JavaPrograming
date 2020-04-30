package com.company;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	   Student First=new Student();
        Scanner user=new Scanner(System.in);
        System.out.println("The Number of Student :");
        First.setStudentNumber(user.nextInt());
        System.out.println("The Name of Student :");
        First.setStudentName(user.next());
        System.out.println("The Entire Average of Student :");
        First.setEntireAverage(user.nextDouble());
        Map map=new HashMap();
        map.put("Number",First.getStudentNumber());
        map.put("Name",First.getStudentName());
        map.put("Average",First.getEntireAverage());
        System.out.println(map.get("Number"));
        System.out.println(map.get("Name"));
        System.out.println(map.get("Average"));
    }
}
