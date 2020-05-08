package com.company;

public class CarFactory {
    public static Car getCar(int c){
        switch(c){
            case 1 :
                return new Benz();
            case 2 :
                return new BMW();
            case 3 :
                return new Mazzeratti();
            case 4 :
                return new Ferarri();
            case 5 :
                return new Chevrolet();
            default :
                return null;

        }
    }
}
