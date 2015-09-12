//imported the scanner class to allow inputs by the user to be assigned to variables
import java.util.Scanner;

public class Timer {
    //declaring the main method
    public static void main (String []args) {
        //initializing the scanner class
        Scanner scan = new Scanner (System.in);
        //prompting the user to enter the current time in the form (####) and assigning it the variable 'start'
        System.out.println("Enter the current time: ");
        int start = scan.nextInt();
        //prompting the user to enter the end time, and assigning it to the variable 'end'
        System.out.println("Enter the time that you will be eating dinner: ");
        int end = scan.nextInt();
        //calculates the time before dinner by subtracting (end - start)
        int time = end - start;
        //gets the number of hours by dividing by 100: (int)(1234/100) = 12
        int hours = (int)(time / 100);
        //gets the number of minutes by taking the remainder when divided by 100: (int)(1234%100) = 34
        int minutes = (int)(time % 100);
        //outputs the total time until dinner in hours and minutes
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    }
}