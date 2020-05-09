package com.company;

public class Nomre {
    public double nomre;
    public void Rank(){
       if(nomre<=20 && nomre>18){
           System.out.println("The rank of "+nomre+" is A");
       }
        else if(nomre<=18 && nomre>16){
            System.out.println("The rank of "+nomre+" is B");
        }
        else if(nomre<=16 && nomre>14){
            System.out.println("The rank of "+nomre+" is C");
        }
        else if(nomre<=14 && nomre>10 && nomre==10){
            System.out.println("The rank of "+nomre+" is D");
        }
        else if(nomre<10) {
            System.out.println("The rank of " + nomre + " is F");
        }
    }
}
