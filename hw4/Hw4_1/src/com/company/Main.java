package com.company;

public class Main {

    public static void main(String[] args) throws Student {
	   Student player=new Student();
		System.out.println("warning:the name and family must be just letters and the password must have 4 or more than 4 letters or digits");
	   try{
	       player.StringName();

       }
	   catch (Exception e){
	       e.printStackTrace();
	   }
		try{
			player.StringFamily();

		}
		catch (Exception e){
			e.printStackTrace();
		}
		try{
			player.StringPassword();

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
