package com.company;

public class Division extends Multiplication {
    double a;
    double b;
    public void division(){
        double c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }

    @Override
    public void total() {
        double c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
    @Override
    public void substraction(){
        double c=a-b;
        System.out.println(a+"-"+b+"="+c);
    }
    @Override
    public void multiplication(){
        double c=a*b;
        System.out.println(a+"*"+b+"="+c);
    }
}
