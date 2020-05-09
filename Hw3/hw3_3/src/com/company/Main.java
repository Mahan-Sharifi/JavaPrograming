package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Tashkhis a=new Tashkhis();
        System.out.println("Please enter a");
        a.a=input.nextInt();
        if(a.a%2==0){
            System.out.format("%d is Even",a.isEven());
            System.out.println();

        }
        else {
            System.out.format("%d is Odd",a.isOdd());
            System.out.println();
        }
        if(a.a>0){
            System.out.format("%d is Positive",a.isPositive());
            System.out.println();
        }
        else if(a.a==0){
            System.out.format("%d is Zero",a.isZero());
            System.out.println();
        }
        else {
            System.out.format("%d is Negative",a.isNegative());
            System.out.println();
        }
    }
}
