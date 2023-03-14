package javaprogrammes;

import java.util.Scanner;

/*
    6. Write a program to enter any radius value of the circle and find out the
       area.(Formula of Area A=PI*r*r).
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Object of SCanner class
        System.out.println("Please enter radius value of the circle : ");
        int radiusValue = scanner.nextInt(); //Read radius value through User Input and Store in First Variable
        area(radiusValue); // called static method

    }
    public static void area(int radius){
        //This method calculates Area of the circle
        double PI = 3.14;
        double A = PI*radius*radius;
        System.out.println("Area of the circle is A: " + A );

    }

}
