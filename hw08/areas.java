//imports the Scanner class
import java.util.Scanner;
public class areas {
    //declares the 'area' method for a circle, only takes 1 parameter (radius)
    public static double area(double radius) {
        return (radius*radius*Math.PI);
    }
    //declares the 'area' method for a rectangle, takes parameters for length and width
    public static double area(double length, double width) {
        return (length * width);
    }
    //declares the 'area' method for a trapezoid, takes parameters for height, base 1, and base 2
    public static double area(double height, double base1, double base2) {
        return ((base1 + base2)/2) * height;
    } 
    //declares the main method
    public static void main (String []args) {
        //initiates the 'scan' instance of the scanner class to be implemented in the program
        Scanner scan = new Scanner(System.in);
        //prompts the user to enter a certain number for a circle, rectangle, or trapezoid
        System.out.println("Enter 1 for a circle, 2 for a rectangle, 3 for a trapezoid, or 0 to quit.");
        //assigns the value enetred to the variable 'go'
        int go = scan.nextInt();
        //as long as 'go' doesn't equal 0, the program will run
        while (go != 0) {
            if (go == 1) {
                //if 'go' = 1, then the user is prompted to enter the radius of the circle
                System.out.print("Enter the radius of the circle: ");
                double r = scan.nextDouble();
                //the 'area' method for a circle is called by only having one parameter
                System.out.println("The area of the circle: " + area(r));
            }
            else if (go == 2) {
                //if 'go' = 2, then the user is prompted to enter the length and width of the rectangle
                System.out.print("Enter the length and width of the rectangle: ");
                double l = scan.nextDouble();
                double w = scan.nextDouble();
                //the 'area' method for a rectangle is called because two paramters are used
                System.out.println("The area of the rectangle: " + area(l, w));
            }
            else if (go == 3) {
                //if 'go' = 3, then the user is prompted to enter the height, base 1, and base 2 of the trapezoid
                System.out.print("Enter the height, base 1, and base 2 of the trapezoid (in that order): ");
                double h = scan.nextDouble();
                double b1 = scan.nextDouble();
                double b2 = scan.nextDouble();
                //the 'area' method for a trapezoid is called since 3 paramters are used.
                System.out.println("The area of the trapezoid: " + area(h, b1, b2));
            }
            else {
                //if a value other than 0, 1, 2, or 3 is entered for 'go', then this happens
                System.out.println("wrong number.............");
            }
            //while loop runs until the user enters a value of 0 for 'go'
            System.out.println("Enter 1 for a circle, 2 for a rectangle, 3 for a trapezoid, or 0 to quit.");
            go = scan.nextInt();
            
        }
    }
}