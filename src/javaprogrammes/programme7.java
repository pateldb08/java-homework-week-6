package javaprogrammes;

import java.util.Scanner;

/*
    7. Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Object of Scanner class
        System.out.println("Please enter temperature value in degree Fahrenheit : ");
        double degreeFahrenheit = scanner.nextDouble(); //Read degree farenhit value from user
        Celsius(degreeFahrenheit); //Called static method


    }

    public static void Celsius(double degreeFahrenheit) {
        //Static method convert degree fahrenhit into degree celsius
        double c = (degreeFahrenheit - 32) * 5/9;
        System.out.println("Temperature value in degree Celsius is: " + c);
    }
}
