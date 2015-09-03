import java.util.Scanner;

public class Rectangle {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        double Area = height * width;
        System.out.println("The Area of the rectangle is " + Area);
    }
}