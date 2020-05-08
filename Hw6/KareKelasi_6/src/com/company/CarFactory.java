package com.company;

public class CarFactory {
    public static Cal getCal(int c){
        switch(c){
            case 1 :
                return new CalcPlus();
            case 2 :
                return new CalcMinus();
            default :
                return null;
        }
    }
}
