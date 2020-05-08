package com.company;

public class CalcMinus extends Calculate implements Cal {

    @Override
    public void Calc(int a,int b) {
        int sum=a-b;
        System.out.println(a+"-"+b+"="+sum);
    }
}
