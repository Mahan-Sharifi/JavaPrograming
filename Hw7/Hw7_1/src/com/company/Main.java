package com.company;
import java.util.Scanner;
import java .sql.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SiteUser user=new SiteUser();
        int i, n;
        System.out.println("Please enter your number of Users :");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.format("The %dth User :",i);
                System.out.println();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into person(id,username,email,password,age,education) values (?,?,?,?,?,?)");
                System.out.println("Please enter your ID :");
                user.setId(scanner.nextInt());
                preparedStatement.setLong(1, user.getId());
                System.out.println("Please enter your UserName :");
                user.setName(scanner.next());
                preparedStatement.setString(2, user.getName());
                System.out.println("Please enter your Email :");
                user.setEmail(scanner.next());
                preparedStatement.setString(3, user.getEmail());
                System.out.println("Please enter your Password :");
                user.setPassword(scanner.nextInt());
                preparedStatement.setLong(4, user.getPassword());
                System.out.println("Please enter your age :");
                user.setAge(scanner.nextInt());
                preparedStatement.setLong(5, user.getAge());
                System.out.println("Please enter your Education :");
                user.setEducation(scanner.next());
                preparedStatement.setString(6,user.getEducation());
                System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
            } catch (ClassNotFoundException e) {
                System.out.println("DB Driver not Exist!!");
            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }
        }
    }
}
