//imports the scanner clas to be used in the program
import java.util.Scanner;

public class pyramid {
    //main method is initialized
    public static void main (String [] args) {
        //creates a new instance 'scan' of the scanner class to be used in the program
        Scanner scan = new Scanner(System.in);
        //prompts the user to enter the size, or number of levels for the pyramid
        System.out.println("Enter the size of the pyramid: ");
        //sets the value for size to the variable 'level'
        int level = scan.nextInt();
        //for loop keeps running until all levels are created.
        for (int current = 1; current <= level; current++)
        {
            //for loop prints out spaces a distance of level-current, as current increases, there will be less space
            //as the base of the pyramid gets larger
            for (int a = 1; a <= level - current; a++)
            {
                System.out.print(" ");
            }
            //after the correct number of spaces has been printed for the certain level, this for loop prints the stars.
            //current is constantly increasing, so when current = 1, only 1 star is printed (top of pyramid)
            //when current = 3, 5 stars are printed (3rd level from the top)
            for (int b = 1; b <= (current*2) - 1; b++)
            {
                System.out.print("*");
            }
            //creates an empty line between each level of the pyramid.
            System.out.println();
                
            
            
        }
    }
}