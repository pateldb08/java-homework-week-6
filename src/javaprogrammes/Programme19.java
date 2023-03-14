package javaprogrammes;

/*
        19. Write a Java program to convert a given string into lowercase.
            Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
            Output: the quick brown fox jumps over the lazy dog.

 */
public class Programme19 {
    public static void main(String[] args) {
        Programme19 programme19 = new Programme19();
        programme19.convert(); //called instant method
    }
    public void convert(){
        //Convert string value into lowercase
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOGS.";
        System.out.println("Given string : = " + s1);
        System.out.println("Output:" + s1.toLowerCase());
    }
}












