//imports the Scanner class to be used in the program
import java.util.Scanner;

public class method {
    //declares the 'mean' method, says it will return a double value, and takes 10 numbers.
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        //returns the mean, or average, of the 10 numbers.
        return ((a + b + c + d + e + f + g + h + i + j)/10);
    }
    //declares the 'median' method, says it will return a double value, and only takes two numbers.
    //those two numbers are the input values at n/2 and (n+1)/2, where n = 10, or the fifth and sixth numbers entered
    public static double median(double e, double f) {
        //returns the median by taking the average of the fifth and sixth values entered by the user
        return (e + f)/2;
    }
    //declares the 'print' method, which will return nothing, it is void. 
    //it takes two values, the value for the mean(m1), and the value for the median(m2)
    public static void print(double m1, double m2) {
        //prints the mean
        System.out.println("The Mean of the ten numbers is: " + m1);
        //prints the median
        System.out.println("The Median of the ten numbers is: " + m2);
    }
    
    //declares the main method, which returns nothing: void
    public static void main (String []args) {
        //initializes the scan instance of the Scanner class to be used in the program.
        Scanner scan = new Scanner (System.in);
        //prompts the user to enter 10 values.
        System.out.println("Enter ten numbers: ");
        //assigns each of these ten values to a double variable. 
        //used double since the lab did not specify entering integers or doubles.
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double g = scan.nextDouble();
        double h = scan.nextDouble();
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        //assigns the value returned from the 'mean' method to the variable m1
        double m1 = mean(a, b, c, d, e, f, g, h, i, j);
        //assigns the value returned from the 'median' method to the varible m2
        double m2 = median(e, f);
        //calls the 'print' method, which returns nothing, but prints out the values for the user to see.
        print(m1, m2);
    }
}