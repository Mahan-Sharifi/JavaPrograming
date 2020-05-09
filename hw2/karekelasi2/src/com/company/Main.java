package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Nomre daneshjoe=new Nomre();
        Scanner input=new Scanner(System.in);
        int i;
        double Maximum=0;
        for(i=1;i<=5;i++) {
            System.out.format("Nomre daneshjoe %d", i);
            System.out.println();
            daneshjoe.nomre = input.nextDouble();
            daneshjoe.Rank();

            if (Maximum < daneshjoe.nomre) {
                Maximum = daneshjoe.nomre;
            }
        }

        System.out.println("the Maximum Number is "+Maximum);
    }
}
