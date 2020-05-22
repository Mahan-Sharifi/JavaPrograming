package com.company;

import java.sql.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanyUser user=new CompanyUser();
        int s;

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into CompanyUser(code,name,nationalCode,FatherName,post,salary,WorkExperience) values (?,?,?,?,?,?,?)");
            System.out.println("Your code is 1");
            preparedStatement1.setLong(1, 1);
            System.out.println("Please enter your Name :");
            user.setName(scanner.next());
            preparedStatement1.setString(2, user.getName());
            System.out.println("Please enter your Nationalcode :");
            user.setNationalcode(scanner.nextInt());
            preparedStatement1.setLong(3, user.getNationalcode());
            System.out.println("Please enter your FatherName :");
            user.setFatherName(scanner.next());
            preparedStatement1.setString(4, user.getFatherName());
            System.out.println("Please enter your Post :");
            user.setPost(scanner.next());
            preparedStatement1.setString(5, user.getPost());
            System.out.println("Please enter your Salary :");
            user.setSalary(scanner.nextInt());
            preparedStatement1.setLong(6, user.getSalary());
            System.out.println("Please enter your WorkExperience :");
            user.setWorkExperience(scanner.next());
            preparedStatement1.setString(7, user.getWorkExperience());
            System.out.println("Insert into DB " + preparedStatement1.executeUpdate());

            PreparedStatement preparedStatement2 = connection.prepareStatement("insert into CompanyUser(code,name,nationalCode,FatherName,post,salary,WorkExperience) values (?,?,?,?,?,?,?)");
            System.out.println("Your code is 2");
            preparedStatement2.setLong(1, 2);
            System.out.println("Please enter your Name :");
            user.setName(scanner.next());
            preparedStatement2.setString(2, user.getName());
            System.out.println("Please enter your Nationalcode :");
            user.setNationalcode(scanner.nextInt());
            preparedStatement2.setLong(3, user.getNationalcode());
            System.out.println("Please enter your FatherName :");
            user.setFatherName(scanner.next());
            preparedStatement2.setString(4, user.getFatherName());
            System.out.println("Please enter your Post :");
            user.setPost(scanner.next());
            preparedStatement2.setString(5, user.getPost());
            System.out.println("Please enter your Salary :");
            user.setSalary(scanner.nextInt());
            preparedStatement2.setLong(6, user.getSalary());
            System.out.println("Please enter your WorkExperience :");
            user.setWorkExperience(scanner.next());
            preparedStatement2.setString(7, user.getWorkExperience());
            System.out.println("Insert into DB " + preparedStatement2.executeUpdate());

            PreparedStatement preparedStatement3 = connection.prepareStatement("insert into CompanyUser(code,name,nationalCode,FatherName,post,salary,WorkExperience) values (?,?,?,?,?,?,?)");
            System.out.println("Your code is 3");
            preparedStatement3.setLong(1, 3);
            System.out.println("Please enter your Name :");
            user.setName(scanner.next());
            preparedStatement3.setString(2, user.getName());
            System.out.println("Please enter your Nationalcode :");
            user.setNationalcode(scanner.nextInt());
            preparedStatement3.setLong(3, user.getNationalcode());
            System.out.println("Please enter your FatherName :");
            user.setFatherName(scanner.next());
            preparedStatement3.setString(4, user.getFatherName());
            System.out.println("Please enter your Post :");
            user.setPost(scanner.next());
            preparedStatement3.setString(5, user.getPost());
            System.out.println("Please enter your Salary :");
            user.setSalary(scanner.nextInt());
            preparedStatement3.setLong(6, user.getSalary());
            System.out.println("Please enter your WorkExperience :");
            user.setWorkExperience(scanner.next());
            preparedStatement3.setString(7, user.getWorkExperience());
            System.out.println("Insert into DB " + preparedStatement3.executeUpdate());


        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }

            System.out.println("enter your code if you want your account become deleted Otherwise enter 0");
            s = scanner.nextInt();
            if (s == 0) {

            } else {
                try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380")) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement1;
                    PreparedStatement preparedStatement2;
                    PreparedStatement preparedStatement3;
                switch (s) {
                    case 1:
                        preparedStatement1 = connection.prepareStatement("delete from CompanyUser where code=?");
                        preparedStatement1.setLong(1, 1);
                        System.out.println("Delete from DB " + preparedStatement1.executeUpdate());
                        break;
                    case 2:
                        preparedStatement2 = connection.prepareStatement("delete from CompanyUser where code=?");
                        preparedStatement2.setLong(1, 2);
                        System.out.println("Delete from DB " + preparedStatement2.executeUpdate());
                        break;
                    case 3:
                        preparedStatement3 = connection.prepareStatement("delete from CompanyUser where code=?");
                        preparedStatement3.setLong(1, 3);
                        System.out.println("Delete from DB " + preparedStatement3.executeUpdate());
                        break;
                }

            }
        catch(ClassNotFoundException e){
                System.out.println("DB Driver Not Exist!!");
            } catch(SQLException e){
                System.out.println("DB ERROR " + e.getMessage());
            }

        }
    }
}
