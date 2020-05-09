package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Division a=new Division();
	Division b=new Division();
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter a");
	a.a=input.nextDouble();
	System.out.println("Please enter b");
	a.b=input.nextDouble();
	a.division();
	a.substraction();
	a.total();
	a.multiplication();
    }
}
