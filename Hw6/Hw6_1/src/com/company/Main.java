package com.company;

public class Main {

    public static void main(String[] args) {
	User user=new User().setUsername("Mahan7").setRealName("Mahan").setPassword(9889).setAge(18).setAddress("Tehram,Gisha").setCellphoneNumber(96325478).setEducationLevel("Diploma");
        System.out.println("The username : ");
        System.out.println(user.getUsername());
        System.out.println("The realname : ");
        System.out.println(user.getRealName());
        System.out.println("The password : ");
        System.out.println(user.getPassword());
        System.out.println("The age : ");
        System.out.println(user.getAge());
        System.out.println("The address : ");
        System.out.println(user.getAddress());
        System.out.println("The celllphoneNumber : ");
        System.out.println(user.getCellphoneNumber());
        System.out.println("The EducationLevel : ");
        System.out.println(user.getEducationLevel());
    }
}
