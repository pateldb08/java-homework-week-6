package javaprogrammes;

/*
    18. Write a Java program to print the sum (addition), multiply, subtract, divide
    and  remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
          Expected Output :
          125 + 24 = 149
          125 - 24 = 101
          125 x 24 = 3000
          125 / 24 = 5
          125 mod 24 = 5

 */
public class Programme18 {
    public static void main(String[] args) {
        Programme18 programme18 = new Programme18();
        programme18.addition(programme18.n1, programme18.n2); //called instant method addition
        programme18.substraction(programme18.n1, programme18.n2); //called instant method substraction
        programme18.multiplication(programme18.n1, programme18.n2); //called instant method multiplication
        programme18.division(programme18.n1, programme18.n2); //called instant method division
        programme18.modulus(programme18.n1, programme18.n2); // call instant method modulus


    }

    int n1 = 125;
    int n2 = 24;

    public void addition(int n1, int n2) {
        //calculate addtion of the number
        int result = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + result);
    }

    public void substraction(int n1, int n2) {
        //calculate substration of the number
        int result = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + result);
    }

    public void multiplication(int n1, int n2) {
        //calculate multiplication of the number
        int result = n1 * n2;
        System.out.println(n1 + "*" + n2 + "=" + result);
    }

    public void division(int n1, int n2) {
        //calculate division of the number
        int result = n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + result);
    }

    public void modulus(int n1, int n2) {
        //calculate mod of the number
        int result = n1 % n2;
        System.out.println(n1 + "%" + n2 +"=" + result);

    }

}
