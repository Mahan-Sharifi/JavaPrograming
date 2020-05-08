package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Car Brand :");
	  switch(scanner.next()){
          case "Benz" :
              Car car=CarFactory.getCar(Car.Benz);
              car.Information();
              break;
          case "BMW" :
              Car car1=CarFactory.getCar(Car.BMW);
              car1.Information();
              break;
          case "Mazzeratti" :
              Car car2=CarFactory.getCar(Car.Mazzeratti);
              car2.Information();
              break;
          case "Ferrari" :
              Car car3=CarFactory.getCar(Car.Ferrari);
              car3.Information();
              break;
          case "Chevrolet" :
              Car car4=CarFactory.getCar(Car.Chevrolet);
              car4.Information();
              break;

	  }

    }
}
