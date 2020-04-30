package com.company;
import sun.reflect.SignatureIterator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    SiteUsers p1=new SiteUsers();
	    Scanner user=new Scanner(System.in);
        System.out.println("The name of user :");
	    p1.setName(user.next());
        System.out.println("The name of user :");
	    p1.setFamily(user.next());
        System.out.println("The number of cellphone of user :");
	    p1.setCellphoneNumber(user.nextInt());
        System.out.println("The national code of user :");
	    p1.setNationalCode(user.nextInt());
	    SiteUsers p2=null;
        SiteUsers p3=null;
        SiteUsers p4=null;
        try {
            p2=(SiteUsers) p1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        try {
            p3=(SiteUsers) p1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        try {
            p4=(SiteUsers) p1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        if(!p1.equals(p2)){
            System.out.println(p1);
            System.out.println(p2);
            System.out.println("The name of user :");
            System.out.println(p1.getName());
            System.out.println(p2.getName());
        }
        if(!p1.equals(p3)){
            System.out.println(p1);
            System.out.println(p3);
            System.out.println("The family of user :");
            System.out.println(p1.getFamily());
            System.out.println(p3.getFamily());
        }
        if(!p1.equals(p4)){
            System.out.println(p1);
            System.out.println(p4);
            System.out.println("The number of cellphone of user :");
            System.out.println(p1.getCellphoneNumber());
            System.out.println(p4.getCellphoneNumber());
            System.out.println("The national code of user :");
            System.out.println(p1.getNationalCode());
            System.out.println(p4.getNationalCode());
        }

    }
}
