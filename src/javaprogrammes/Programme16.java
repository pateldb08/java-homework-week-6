package javaprogrammes;

/*
        16. Write a Java program to add two binary numbers.
            Input Data:
                    Input first binary number: 10
                    Input second binary number: 11
            Expected Output:
                Sum of two binary numbers: 101
 */
public class Programme16 {
    public static void main(String[] args) {
        Programme16 programme16 = new Programme16();
        programme16.sumofbinarynumbers();
    }
    public void sumofbinarynumbers(){
        // Two input stirngs containg binary numbers of the integers //
        String a = "10";
        String b = "11";
        // Use as radix 2 because it is binary //
        int c = Integer.parseInt(a,2);  //Convert Binary number to Integer
        int d = Integer.parseInt(b,2);  // convert binary number to integer
        int sum = c + d; // sum of Integer

        //convert sum of integer into  binary value //
        System.out.println("Sum Of Two Binary Numbers is: " + Integer.toBinaryString(sum));
    }


}
