package com.company;
        import java.util.Scanner;
public class Grade2Equation extends Exception {
    public Grade2Equation(String msg){
        super(msg);
    }
    public Grade2Equation(){}
    public static void grade2Equation ()throws Grade2Equation{
        Scanner user=new Scanner(System.in);
        double a=0,b=0,c =0;

        System.out.println("Enter the a");
        a=user.nextDouble();
        System.out.println("Enter the b");
        b=user.nextDouble();
        System.out.println("Enter the c");
        c=user.nextDouble();

        System.out.println(a+"x*x+"+b+"x+"+c+"=0");
        double x=0;
        double x1=0,x2=0;
        double delta =(b*b)-4*a*c;
        if(delta<0){
            throw new Grade2Equation("Delta is negative and equation doesn't have answer");
        }
        else if (delta==0) {
            x=-(b/(2*a));
            System.out.println("x"+x);
        }
        else{
            x1=((-b)+Math.sqrt(delta))/(2*a);
            x2=((-b)-Math.sqrt(delta))/(2*a);
            System.out.println("x1="+x1);
            System.out.println("x2"+x2);
        }
    }
}