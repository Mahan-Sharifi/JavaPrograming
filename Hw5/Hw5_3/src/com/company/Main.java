package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	Coordinate coordinate=new Coordinate();
	Scanner user=new Scanner(System.in);
	System.out.println("The name of Student :");
	coordinate.setNameOfStudent(user.next());
	System.out.println("The nummber of Student :");
	coordinate.setNumberOfStudent(user.next());
	System.out.println("The name of Father :");
	coordinate.setFatherName(user.next());
	System.out.println(coordinate.getNameOfStudent());
	System.out.println(coordinate.getNumberOfStudent());
	System.out.println(coordinate.getFatherName());

	System.out.println("The first score :");
	coordinate.setScore(user.nextDouble());
	List <Object> list=new ArrayList<>();
	list.add(coordinate.getScore());
	System.out.println("The second score :");
	coordinate.setScore(user.nextDouble());
	list.add(coordinate.getScore());
	System.out.println("The third score :");
	coordinate.setScore(user.nextDouble());
	list.add(coordinate.getScore());
	System.out.println("The fourth score :");
	coordinate.setScore(user.nextDouble());
	list.add(coordinate.getScore());
	System.out.println("The fifth score :");
	coordinate.setScore(user.nextDouble());
	list.add(coordinate.getScore());
	for(Object s : list){
        System.out.println(s);
    }
    }
}
