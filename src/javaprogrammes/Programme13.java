package javaprogrammes;

import java.util.Scanner;

/*
        13. Write a Java program that takes three numbers as input to calculate and
            print the average of the numbers.
 */
public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create object to Scanner class
        System.out.println("Please enter first number: ");
        int n1 = scanner.nextInt(); //Accept first number from user
        System.out.println("please enter second number: ");
        int n2 = scanner.nextInt(); //Accept second number from user
        System.out.println("Plese enter third number: ");
        int n3 = scanner.nextInt(); //Accept third number from user
        Avg(n1,n2,n3); //called static method

    }
    public static void Avg(int n1,int n2,int n3){
        //Calculate average of three number
        int A = (n1 + n2 + n3) / 3;
        System.out.println("Average: = " + A);


    };
}
