//imports the scanner and random classes to be used in the program
import java.util.Scanner;
import java.util.Random;

public class move_array {
    //declaration of the main method
    public static void main (String[] args) {
        //initializes the 'scan' and 'generator' instances of the Scanner and Random classes
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //prompts the user to enter the size of the the array, and assigns that value to 'size'
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        //checks to make sure 'size' != 0, with a try /catch statement
        try {
            int t = 100/size;
        }
        //if 'size' = 0, then the catch statement runs, prompting the user to try again
        catch(Exception e) {
            System.out.println("The size of the array needs to be greater than 0.");
            System.out.print("Enter the size of the array, greater than 0: ");
            size = scan.nextInt();
        }
        //creates an array of length 'size'
        int[] array = new int[size];
        //fills the array with Random values(0-100) and prints out the array
        for (int x = 0; x < size; x++) {
            array[x] = generator.nextInt(101);
            System.out.print(array[x] + " ");
        }
        System.out.println();
        //prompts the user to enter the index of the array they want to move
        System.out.print("Enter the index of the value you want to move: ");
        int move = scan.nextInt();
        //another try/catch statement, tries to run the for loop.
        //if an out of bounds exception occurs('move' is less than 0 or greater than 'size'), the catch statement prints a response
        try {
            for (int i = move; i < (size-1); i++) {
                int n1 = array[i];
                int n2 = array[i+1];
                array[i] = n2;
                array[i+1] = n1;
             }
             if (move < 0 || move >= size) {
                 int m = 1/0;
             }
             //prints out the sorted array
             for (int j = 0; j < size; j++) {
                 System.out.print(array[j] + " ");
             }
        }
        
        catch(Exception e) {
            System.out.println("The index you entered was out of bounds.");
        }
    
    }
    
}