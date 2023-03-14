package javaprogrammes;
/*
    15. Write a Java program to swap two variables.
 */
public class Programme15 {
    public static void main(String[] args) {
        Programme15 programme15 = new Programme15();
        programme15.swap(programme15.a , programme15.b); //called instant method and passed instant variable


    }
    int a = 5;
    int b = 3;
    public void swap(int a , int b){
        //Swap number
        System.out.println("Before swap: ");
        System.out.println("Value of a: = " + a);
        System.out.println("Value of b: = " + b);
        int temp = a;
         a = b;
         b = temp;
        System.out.println( " After swap: ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + temp);


    }

}
