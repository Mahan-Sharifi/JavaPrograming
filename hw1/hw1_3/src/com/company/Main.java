package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// gereftan do addae amaliat anjam dadan bar raoye anha
       Scanner input=new Scanner(System.in);
       double n,m,c=0;
       System.out.println("enetr n: ");
       n=input.nextDouble();
       System.out.println("enter m: ");
       m=input.nextDouble();
       int s;
       System.out.println("enter your number of case");
       s=input.nextInt();
       switch(s){
           case 1:
               c=n+m;
               break;
           case 2:
               if(n>m){
                   c=n-m;
               }
               else {
                   c=m-n;
               }
               break;
           case 3:
               c=n*m;
               break;
           case 4:
               if(n>m){
                   c=n/m;
               }
               else {
                   c=m/n;
               }
               break;
       }
       System.out.println(c);
    }
}
