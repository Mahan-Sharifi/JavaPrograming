package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("tedad dars daneshjoe");
        double n=input.nextInt(),zaribDarsa;
        double i,sumOfZarib=0,nomreDarsa, s=0,avg=0;
        String lessonOfDaneshjoe;
        for(i=0;i<n;i++){
            System.out.println("enter the lesson");
            lessonOfDaneshjoe=input.next();
            System.out.println("enter the zarib of lesson");
            zaribDarsa=input.nextInt();
            System.out.println("nomre of daneshjoe");
            nomreDarsa=input.nextInt();
            sumOfZarib+=zaribDarsa;
            s+=nomreDarsa*zaribDarsa;
        }
        avg=s/sumOfZarib;
        System.out.println("the avg is");
        System.out.println(avg);
        if(avg>=10){
            System.out.println(" daneshjoe ghabol shode ast");
        }
        else {
            System.out.println(" daneshjoe mashrot shode ast");
        }

    }
}