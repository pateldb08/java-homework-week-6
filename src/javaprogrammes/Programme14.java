package javaprogrammes;
/*
    14. Write a Java programe to print the area and perimeter of a rectangle.

        Test Data:
        Width = 5.5 Height = 8.5

        Expected Output:

        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void main(String[] args) {
        Programme14 programme14 = new Programme14(); // creat object//
        programme14.rectangle(programme14.w ,  programme14.h); // call method via object veriable //

    }
    double w = 5.6;
    double h = 8.5;
    public void rectangle(double w , double h){
        //calculate are and perimeter of rectangle
        double area = w * h;
        double perimeter = 2 * (w+h);
        System.out.println("Area is: " + w + "*" + h + "=" + area );
        System.out.println("Perimeter is 2 * (" + w + "+" + h + ") = " + perimeter);


    }
}
