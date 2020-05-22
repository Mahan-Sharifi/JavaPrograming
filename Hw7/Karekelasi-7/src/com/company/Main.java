package com.company;

import java.util.Scanner;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        VorodBeHesab vorodBeHesab=new VorodBeHesab();
        EgadHesab egadHesab=new EgadHesab();
        int n;
        System.out.println("If you want to enter to account write 1 and want to create account write 2");
        n=scanner.nextInt();
        if(n==1){
            try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Mahan","Mahan1380")){
                Class.forName("oracle.jdbc.driver.OracleDriver");
                PreparedStatement preparedStatement=connection.prepareStatement("insert into VorodBeHesab(username,password)values (?,?)");
                System.out.println("Please enter your UserName :");
                vorodBeHesab.setUserName(scanner.next());
                preparedStatement.setString(1,vorodBeHesab.getUserName());
                System.out.println("Please enter your Password :");
                vorodBeHesab.setPassword(scanner.next());
                preparedStatement.setString(2,vorodBeHesab.getPassword());
                System.out.println("Insert into DB :"+preparedStatement.executeUpdate());
            }
            catch (ClassNotFoundException e){
                System.out.println("DB Driver is not exist!!");

            }
            catch (SQLException e){
                System.out.println("DB ERROR "+e.getMessage());
            }

        }
        else if(n==2) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into EgadHesab(name,username,email,password)values (?,?,?,?)");
                System.out.println("Please enter the Name :");
                egadHesab.setName(scanner.next());
                preparedStatement.setString(1, egadHesab.getName());
                System.out.println("Please enter your UserName :");
                egadHesab.setUserName(scanner.next());
                preparedStatement.setString(2, egadHesab.getUserName());
                System.out.println("Please enter the email :");
                egadHesab.setEmail(scanner.next());
                preparedStatement.setString(3, egadHesab.getEmail());
                System.out.println("Please enter your Password :");
                vorodBeHesab.setPassword(scanner.next());
                preparedStatement.setString(4, vorodBeHesab.getPassword());
                System.out.println("Insert into DB :" + preparedStatement.executeUpdate());
            } catch (ClassNotFoundException e) {
                System.out.println("DB Driver is not exist!!");

            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }
        }
            try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Mahan","Mahan1380")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                PreparedStatement preparedStatement = connection.prepareStatement("select * from VorodBeHesab");
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println("VorodBeHEsab List :");
                System.out.println();
                while (resultSet.next()) {
                    System.out.println("UserName :" + resultSet.getString("UserName"));
                    System.out.println("Password :" + resultSet.getString("Password"));
                    System.out.println();
                }
            }
            catch (ClassNotFoundException e){
                System.out.println("DB Driver is not exist!!");

            }
            catch (SQLException e){
                System.out.println("DB ERROR "+e.getMessage());
            }

        try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Mahan","Mahan1380")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from EgadHesab");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("EgadHesab List :");
            System.out.println();
            while (resultSet.next()) {
                System.out.println("Name :"+resultSet.getString("Name"));
                System.out.println("UserName :" + resultSet.getString("UserName"));
                System.out.println("Email :"+resultSet.getString("Email"));
                System.out.println("Password :" + resultSet.getString("Password"));
                System.out.println();
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("DB Driver is not exist!!");

        }
        catch (SQLException e){
            System.out.println("DB ERROR "+e.getMessage());
        }



    }
}