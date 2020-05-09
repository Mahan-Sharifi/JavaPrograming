package com.company;

public class Moadele {
    public double a,b,c,d,e,f;
    public void X(){
        double h=((e*d)-(b*f))/((a*d)-(b*c));
        System.out.println("x= "+h);
    }
    public void Y(){
        double h=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("y= "+h);
    }
}
