package javaprogrammes;
/*
    4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
            print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.
 */
    public class Programme4 {
        int a = 3; // Declare instant variable
        int b = 2; // Declare instant variable
        static int c = 5; // Declare static variable
        static int d = 6; // Declare static variable
        public void programme4(){
            // sum of instant variable in instant method
            int ans = (a+b);
            System.out.println(a);
            System.out.println(b);
            System.out.println("sum of two int is : " + ans);
        }
        public static void programme4_static(){
            //Sum of static variable in static metod
            System.out.println(c);
            System.out.println(d);
            System.out.println(c+d );

        }

        public static void main(String[] args) {
            Programme4 programme4 = new Programme4();
            programme4.programme4();
            programme4_static();
        }
    }


