package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // bozorg tarin addad dar araye n taei
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("enter n: ");
        n=input.nextInt();
        int arr[]=new int[n];
        int i;
        int maximumNumber=0;
        for(i=0;i<n;i++){
            System.out.println("enter deraye: ");
            int m=input.nextInt();
            if(m>maximumNumber){
                maximumNumber=m;
            }
        }
        System.out.println("the maximum number is ");
        System.out.println(maximumNumber);
    }
}
