package javaprogrammes;

import java.util.Scanner;

/*
     8. Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Object of scanner class
        System.out.println("Please entre the value of height: ");
        double hight = scanner.nextInt(); //Accept hight value from user
        System.out.println("Please entre the value of base: ");
        double base = scanner.nextInt(); //Accept base value from user
        area(hight,base); //called static method

    }
    public static void area(double height, double base){
        //Calculate are
        double A = height * base/2;
        System.out.println("The area of the triangel is: "+ A);

    }
}
