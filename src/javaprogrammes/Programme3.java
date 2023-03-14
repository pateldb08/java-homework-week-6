package javaprogrammes;

/*
    3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
            print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.

 */
public class Programme3 {
    int a = 3;  // instance variable
    static int c = 5;  // static variable

    public void programme3() {  // instance method
        System.out.println(a);  // calling instance variable
        System.out.println(c);  // calling static variable
    }

    public static void programme3_static() {  // statci method
        System.out.println(c);    // calling static variable
        Programme3 programme3 = new Programme3();  // calling instance variable
        System.out.println(programme3.a);
    }

    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        programme3.programme3();  // calling instance method
        programme3_static();   // calling static method
    }
}
