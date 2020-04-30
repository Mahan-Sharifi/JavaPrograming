package com.company;

public class Main {

    public static void main(String[] args) {
	  setterAndGetter user1=new setterAndGetter();
	  user1.setAge(18);
	  user1.setName("Mahan");
	  user1.setFamily("SHarifi");
	  user1.setUsername("Mahan27");
	  user1.setJob("student");
	  user1.setPassword("Mah7");
	  System.out.println("The Age :");
	  System.out.println(user1.getAge());
	  System.out.println("The name :");
	  System.out.println(user1.getName());
	  System.out.println("The Family :");
	  System.out.println(user1.getFamily());
	  System.out.println("The Username :");
	  System.out.println(user1.getUsername());
	  System.out.println("The Job :");
	  System.out.println(user1.getJob());
	  System.out.println("The Password :");
	  System.out.println(user1.getPassword());
    }
}
