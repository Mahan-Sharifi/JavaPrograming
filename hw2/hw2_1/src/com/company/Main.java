package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int width,length;
        System.out.println("please enter the width of rectangle");
        width=input.nextInt();
        System.out.println("please enter the length of rectangle");
        length=input.nextInt();
        int masahatOfRectangle=width*length;
        int mohitOfRectangle=(width+length)*2;
        System.out.println("please enter the width of square");
        width=input.nextInt();
        int masahatOfSquare=width*width;
        int mohitOfSquare=width*4;
        System.out.println("the masahat of rectangle is "+masahatOfRectangle+" and mohit rectangle is "+mohitOfRectangle);
        System.out.println("the masahat of square is "+masahatOfSquare+" and the mohit of square is "+mohitOfSquare);
    }


}
