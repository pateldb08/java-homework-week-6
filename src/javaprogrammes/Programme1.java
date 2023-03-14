package javaprogrammes;

/*
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    String a = "Java";
    String b = "Course";

    public void programme1() {   // instance method
        System.out.println(a + b);

    }

    public static void main(String[] args) {
        Programme1 programme1 = new Programme1();
        programme1.programme1();  // calling instance method in main method via object
    }

}

