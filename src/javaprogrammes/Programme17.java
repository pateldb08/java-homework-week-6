package javaprogrammes;
/*
    17. Write a Java program to convert a decimal number to binary number.  Input Data:
        Input a Decimal Number : 5
        Expected Output
        Binary number is: 101

 */
public class Programme17 {
    public static void main(String[] args) {
        Programme17 programme17 = new Programme17();
        programme17.convert(); //called instant method

    }
    public void convert(){
        int decimalNo = 5;
        // convert deciaml to binary //
        System.out.println("Expected Output: " + Integer.toBinaryString(decimalNo));
    }
}
