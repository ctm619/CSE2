//Caleb Mandile
//importing the scanner class to use in the program. 
//Allows me to input values for the variables in the program.
import java.util.Scanner;


public class Check {
    //Main method, void since it isnt returning any values.
    public static void main (String[]args) {
        //declareed instance of the scanner class and called the scanner constructor
        Scanner scan = new Scanner(System.in);
        //prompt the user to enter the cost of the meal
        System.out.print("Enter the original cost of the check in the format ##.##: ");
        //assigns that value to the variable 'cost'
        double cost = scan.nextDouble();
        //prompts the user to enter the tip
        System.out.print("Enter the percentage tip you want to pay as a whole number (##): ");
        //assigns the value to the variable 'tip'
        double tip = scan.nextDouble();
        //changes the tip from a whole number (15 %) to a decimal (0.15)
        tip /= 100;
        //prompts the user to input the number of people at dinner
        System.out.print("Enter how many people were at the dinner: ");
        //assigns that value to the variable 'numPeople'
        int numPeople = scan.nextInt();
        //Calculates the total cost ( cost + the tip)
        double totalCost = cost + (cost*tip);
        //Calculates cost per person
        double perPerson = totalCost/numPeople;
        //calculates the amount in dollars (no cents) each person will owe
        int dollars = (int)perPerson;
        //Calculates the number of dimes
        int dimes = (int)(perPerson * 10) % 10;
        //Calculates number of pennies
        int pennies = (int)(perPerson * 100) % 10;
        //Prints out cost per person.
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
    }
}