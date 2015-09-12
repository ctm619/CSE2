//imported the scanner class to allow inputs from the user to be used as the variables in the program
import java.util.Scanner;

public class Block {
    //declaring the main method
    public static void main (String[]args) {
        //Initializing the Scanner class
        Scanner scan = new Scanner(System.in);
        //prompts the user to enter the length of the block, and then assigns that value to the variable 'length'
        System.out.print("Enter the length of the block: ");
        double length = scan.nextDouble();
        //prompts the user to enter the width of the block, and then assigns that value to the variable 'width'
        System.out.print("Enter the width of the block: ");
        double width = scan.nextDouble();
        //prompts the user to enter the height of the block, and assigns that value to the varaible 'height'
        System.out.print("Enter the height of the block: ");
        double height = scan.nextDouble();
        //Calculates the volume of the block (V = lwh)
        double volume = length * width * height;
        //Calculates the surface area of the block (calculates the area of each side and adds them together)
        double sArea = (2 * length * width) + (2 * length * height) + (2 * height * width);
        //outputs the volume and surface area of the block with the dimesnions the user entered
        System.out.println("The volume of the block with dimensions "+length+" x "+width+" x "+height+": "+volume);
        System.out.println("The surface area of the block is: " + sArea);
    }
}