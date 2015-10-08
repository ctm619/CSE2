//imports the scanner class to be used in the program
import java.util.Scanner;

public class encrypted_x {
    //creates the main method
    public static void main (String[]args) {
        //creates a new instance of the Scanner class 'scan' to be used in the program
        Scanner scan = new Scanner (System.in);
        //prompts the user to enter the size of the output
        System.out.println("Enter the size of the square: ");
        //assigns the user's input to the variable 'input'
        int input = scan.nextInt();
        //checks to see if the user entered a valid int (between 0 and 100)
        if (input <= 0 || input >= 100) 
        {
            //if not, this line of code instantly exits the program
            System.exit(-1);
        }
        //this for loop runs until the correct number of lines have been printed
        //it is responsible for the height of the printout.
        //the height and width is actually (input + 1). 
        for (int h = 0; h <= input; h++) 
        {
            //this for loop creates the rows, and the spaces in the stars that eventually create the x
            for (int x = 0; x <= input; x++) 
            {
                //this if statement prints out a space if the right parameters are met
                //otherwise, it only prints stars
                if (x == h || x == (input - h)) 
                {
                    System.out.print(" ");
                }
                else 
                {
                    System.out.print("*");
                }
            }
            //adds an empty row between each row of stars
            System.out.println();
        }
    }
}