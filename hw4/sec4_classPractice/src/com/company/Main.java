package com.company;

public class Main {

    public static void main(String[] args) throws PersonalInformation {
	 PersonalInformation player=new PersonalInformation();

	 try {
        player.personalInformation();
     }
	 catch (Exception e) {
	     e.printStackTrace();
        }
    }
}
