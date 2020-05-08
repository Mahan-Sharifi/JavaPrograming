package com.company;
import java.util.Scanner;
public class UserInformation {
    Scanner scanner=new Scanner(System.in);
    private String FirstName;
    private String LastName;
    private String FatherName;
    private String EducationLevel;
    private int Age;

    private static UserInformation form=new UserInformation();

    public static UserInformation getInstance(){
        return form;
    }

    private UserInformation(){}

    public void userInformation() {
        int i=0;
        for(i=1;i<=3;i++) {
            System.out.format("The %dth user ",i);
            System.out.println();

            System.out.println("The FirstName is : ");
            FirstName = scanner.next();

            System.out.println("The LastName is : ");
            LastName = scanner.next();

            System.out.println("The Age is : ");
            Age = scanner.nextInt();
            System.out.println("The FatherName is : ");
            FatherName = scanner.next();


            System.out.println("The EducationLevel is : ");
            EducationLevel = scanner.next();
        }
    }

}
