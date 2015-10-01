//imports the scanner and text classes to be used in the program
import java.util.Scanner;
import java.text.*;

public class timeSheets {
    //declares the main method
    public static void main (String []args) {
        //creates the instance of the scanner class 'scan' that is implemented in the program
        Scanner scan = new Scanner(System.in);
        //creates the instance of the decimal format class 'df', and sets it to two decimal places.
        DecimalFormat df = new DecimalFormat("#.##");
        //prompts the user to enter the number of time sheets they will enter
        System.out.println("Enter the number of Employee time sheets you wish to enter: ");
        //this number is assigned to the variable 'run', and is used as the sentinel value for the while loop
        int run = scan.nextInt();
        int current = 1;
        double total = 0;
        while (current <= run)
        {
            //prompts the user to enter the current employee's pay per hour, and assigns that value to the variable 'wage'
            System.out.println("Enter the employee " + current + "'s pay per hour in cents: ");
            int wage = scan.nextInt();
            //prompts the user to enter 5 numbers at once, one for each day of the week.
            //these five can be entered at once, as long as they are separated by a space.
            System.out.println("Enter number of hours worked each day of the week, separated by a space: ");
            double h1 = scan.nextDouble();
            double h2 = scan.nextDouble();
            double h3 = scan.nextDouble();
            double h4 = scan.nextDouble();
            double h5 = scan.nextDouble();
            //calculates the total payroll by adding the current time sheet to the curent total
            //total hours throughout the week * pay per hour = payroll for that employee
            total = total + (wage * (h1 + h2 + h3 + h4 + h5));
            //adds one to 'current' until 'current' is greater than 'run', at which point the it exits the while loop
            current++;
            
            
        }
        //total is in cents, so $4 is 400. divide by 100 to get dollars.
        total = total / 100;
        //print out the total, and apply the decimal format to make sure its only to 2 decimal places
        System.out.println("Total payroll of all employees: $" + df.format(total));
    }
}