package com.company;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   Students user=new Students();

	   try{
           Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Mahan","Mahan1380");
           Class.forName("oracle.jdbc.driver.OracleDriver");
	       PreparedStatement preparedStatement=connection.prepareStatement("insert into Students(code,Name,YearJoined,average) values (?,?,?,?)");
           System.out.println("Please enter your Code :");
           user.setCode(scanner.nextInt());
	       preparedStatement.setLong(1, user.getCode());
           System.out.println("Please enter your Name :");
           user.setName(scanner.next());
	       preparedStatement.setString(2,user.getName());
           System.out.println("Please enter your YearJoined :");
           user.setYearJoined(scanner.nextInt());
           preparedStatement.setLong(3, user.getYearJoined());
           System.out.println("Please enter your average :");
           user.setAverage(scanner.next());
           preparedStatement.setString(4, user.getAverage());
           System.out.println("Insert into DB : " + preparedStatement.executeUpdate());
       }

	   catch (SQLException e){
           System.out.println("DB ERROR "+e.getMessage());
       }
	   catch(ClassNotFoundException e){
           System.out.println("DB Driver Not Exist!!");
       }
	   int s;
	   System.out.println(" if want to Delete row enter 1 otherwise enter 0");
	   s=scanner.nextInt();
        if(s==1){

                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement=connection.prepareStatement("delete from Students  where Code=?");
                    preparedStatement.setLong(1,user.getCode());
                    System.out.println("Delete from DB : " + preparedStatement.executeUpdate());
                }
                catch(SQLException e){
                    System.out.println("DB ERROR "+e.getMessage());
                }
                catch(ClassNotFoundException e){
                    System.out.println("DB Driver Not Exist!!");
                }


        }
        String m;
        System.out.println("If you want to update, enter your property");
        m=scanner.next();
        switch (m) {
            case "Code":
                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement=connection.prepareStatement("update Students set Code=? where Name=?");
                    System.out.println("Please enter your New Code :");
                    preparedStatement.setLong(1,scanner.nextInt());
                    preparedStatement.setString(2,user.getName());
                    System.out.println("Update into DB : " + preparedStatement.executeUpdate());
                }
                catch (SQLException e){
                    System.out.println("DB ERROR "+e.getMessage());
                }
                catch (ClassNotFoundException e){
                    System.out.println("DB Driver Not Exist!!");
                }
                break;

            case "Name" :
                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement=connection.prepareStatement("update Students set Name=? where Name=?");
                    System.out.println("Please enter your New Name :");
                    preparedStatement.setString(1,scanner.next());
                    preparedStatement.setString(2,user.getName());
                    System.out.println("Update into DB : " + preparedStatement.executeUpdate());
                }
                catch (SQLException e){
                    System.out.println("DB ERROR "+e.getMessage());
                }
                catch (ClassNotFoundException e){
                    System.out.println("DB Driver Not Exist!!");
                }
                break;

            case "YearJoined" :
                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement=connection.prepareStatement("update Students set YearJoined=? where Name=?");
                    System.out.println("Please enter your New YearJoined :");
                    preparedStatement.setLong(1,scanner.nextInt());
                    preparedStatement.setString(2,user.getName());
                    System.out.println("Update into DB : " + preparedStatement.executeUpdate());
                }
                catch (SQLException e){
                    System.out.println("DB ERROR "+e.getMessage());
                }
                catch (ClassNotFoundException e){
                    System.out.println("DB Driver Not Exist!!");
                }
                break;

            case "Average" :
                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Mahan", "Mahan1380");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    PreparedStatement preparedStatement=connection.prepareStatement("update Students set Average=? where Name=?");
                    System.out.println("Please enter your New Average :");
                    preparedStatement.setString(1,scanner.next());
                    preparedStatement.setString(2,user.getName());
                    System.out.println("Update into DB : " + preparedStatement.executeUpdate());
                }
                catch (SQLException e){
                    System.out.println("DB ERROR "+e.getMessage());
                }
                catch (ClassNotFoundException e){
                    System.out.println("DB Driver Not Exist!!");
                }
                break;

        }
    }

}
