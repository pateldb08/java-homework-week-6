package javaprogrammes;

import java.util.Scanner;

/*
    Write a program for a calculator with addition, subtraction, multiplication
    and division methods all with parameters and use string concatenation
    methods.(Note: Two static and Two instance methods.)
 */
public class Programme5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Object of Scanner class
        System.out.println("Please Enter First Number : ");
        int firstNumber = scanner.nextInt(); // Accept First User Input and Store in First Variable
        System.out.println("Please Enter Second Number : ");
        int secondNumber = scanner.nextInt(); // Accept Second User Input and Store in Second Variable
        //called static methods
        addition_cal(firstNumber, secondNumber);
        substraction_cal(firstNumber, secondNumber);
        Programme5 calculation = new Programme5();
        calculation.multiplication_cal(firstNumber, secondNumber);
        calculation.division_cal(firstNumber, secondNumber);

    }


    public static void addition_cal(int a, int b) {
        //Static method for addition
        int ans = a + b;
        System.out.println("sum of two intigers is :  " + ans);
    }

    public static void substraction_cal(int a, int b) {
        //Static method of substratction
        int ans = a - b;
        System.out.println("substraction of two integers is : " + ans);
    }

    public void multiplication_cal(int a, int b) {
        //Static method for multiplication
        int ans = a * b;
        System.out.println("multiplication of two integers is : " + ans);
    }
    public void division_cal(int a, int b) {
        //Static method for division
        int ans = a / b;
        System.out.println("Divisionans of two integers is : " + ans);
    }


}
