//import the Scanner class to be used in the program
import java.util.Scanner;
//imports the Random number class to be used in the program
import java.util.Random;

public class AverageArrays {
    //declares the main method of the class
    public static void main (String[] args) {
        //initiates the 'scan' instance of the Scanner class to be used in the program
        Scanner scan = new Scanner (System.in);
        //initiates the 'generator' instance of the Random class to be used in the program
        Random generator = new Random();
        //prompts the user to enter the number of values to be included in the array
        System.out.print("Enter the number of values to be included in an array: ");
        //sets the user's input to the variable 'n'
        int n = scan.nextInt();
        System.out.println("Below are all the numbers in the array.");
        //Initiates 'arr' as an array of ints to be used
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            //sets the value at place 'i' in 'arr' to a random number between 1 and 100
            //'i' starts at place 0, and the for loop runs until 'i' = 'n'
            arr[i] = generator.nextInt(100) + 1;
        }
        //this for loop simply prints out all the values in array 'arr'
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        int total = 0;
        //this for loop adds the value at each location in 'arr' to a total value
        for (int x = 0; x < n; x++) {
            total = total + arr[x];
        }
        System.out.println("Sum of all numbers in the array: " + total);
        //calculates and prints the average of all the numbers, divides the total value by 'n', the number of values
        int avg = total/n;
        System.out.println();
        System.out.println("Average of the numbers: " + avg);
        System.out.println();
        System.out.println("Below are all the numbers that are greater or equal to the average.");
        //for loop runs through all the values in the array
        for (int k = 0; k < n; k++) {
            //if the value at location 'k' is >= the average, that number is printed out.
            if (arr[k] == avg || arr[k] > avg) {
                System.out.print(arr[k] + " ");
            }
            
        }
        System.out.println();
    }
}