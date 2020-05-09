package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Moadele mesal1=new Moadele();
        System.out.println("please enter the a");
        mesal1.a=input.nextDouble();
        System.out.println("please enter the b");
        mesal1.b=input.nextDouble();
        System.out.println("please enter the c");
        mesal1.c=input.nextDouble();
        System.out.println("please enter the d");
        mesal1.d=input.nextDouble();
        System.out.println("please enter the e");
        mesal1.e=input.nextDouble();
        System.out.println("please enter the f");
        mesal1.f=input.nextDouble();
        System.out.println(mesal1.a+"x"+"+"+mesal1.b+"y="+mesal1.e);
        System.out.println(mesal1.c+"x"+"+"+mesal1.d+"y="+mesal1.f);
        if((mesal1.a/mesal1.c)==(mesal1.b/mesal1.d)){

            System.out.println("moadele javan nadarad");
        }
        else {
            mesal1.X();
            mesal1.Y();
        }





    }
}
