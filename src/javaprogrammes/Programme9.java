package javaprogrammes;

import java.util.Scanner;

/*
    9. Write a program to convert the upper case to lower case.
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Object of scanner class
        System.out.println( "Please enter sentence in upper class:");
        String sentence = scanner.nextLine(); //Accept upper class senetence and store in String variable
        convert(sentence); //called static method

    }
    public static void convert(String sentence){
        //Convert string into lowercase
        String A = sentence.toLowerCase();
        System.out.println("Sentence in lower case:" +  A);
    }
}
