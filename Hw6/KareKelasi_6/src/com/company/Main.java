package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int array[] = new int [3];
        Scanner scanner = new Scanner(System.in);
        int i,sum=0;
        int plus=43;
        int minus=45;
        for (i = 0; i < array.length; i++) {
            System.out.format("your %d deraye :",i+1);
            System.out.println();
            array[i]=scanner.nextInt();

        }
        if (array[1]==43) {
            Cal cal=CarFactory.getCal(Cal.CalcPlus);
            cal.Calc(array[0],array[2]);
        }
        if (array[1]==45) {
            Cal cal=CarFactory.getCal(Cal.CalcMinus);
            cal.Calc(array[0],array[2]);
        }

    }
}
