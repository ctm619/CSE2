//imports the Scanner class to be used in the program.
import java.util.Scanner;

public class CalculatorSpecial {
    public static void main(String []args) {
         //creates the instance of the scanner class 'scan' that is used in the program
        Scanner scan = new Scanner(System.in);
        
       
        //starts the while loop with no user input by setting loop equal to true to start
        boolean loop = true;
        //while loop is true, the following code is carried out
        while (loop) {
            //Prompts the user to enter a value for A, and then assigns it the variable numA
            System.out.print("Enter an integer value for A: ");
            double numA = scan.nextDouble();
            //Prompts the user to enter a value for B, and assigns that value to the variable numB
            System.out.print("Enter an integer value for B: ");
            double numB = scan.nextDouble();
            //Prompts the user to enter what mathematical operation they would like to perform on 
            //the numbers they entered previously
            System.out.print("Enter an operator (+,-,*,/): ");
            //Assigns that operator to the variable op. 
            String op = scan.next();
        
            
            switch (op) {
                //if op = '+' then the result of adding the two numbers is printed
                case "+":
                    System.out.println("A + B = " + (numA + numB));
                    break;
                //if op = '-' then the result of A minus B is printed    
                case "-":
                    System.out.println("A - B = " + (numA - numB));
                    break;
                //if op = '*' then the result of multiplying the two numbers is printed    
                case "*":
                    System.out.println("A * B = " + (numA*numB));
                    break;
                //if op = '/' then the result of A divided by B is printed    
                case "/":
                    
                    System.out.println("A / B = " + (numA/numB));
                    break;
                //if the user entered any operator besides the four given, this default String is printed
                default:
                    System.out.println("That is not a valid operator.");
                    break;
                
            }
            //Prompts the user to input a key indicating whether or not they want to continue
            System.out.print("Press N or n to stop, press anything else to continue: ");
            //Assigns the user's input to the String stop
            String stop = scan.next();
            //if else statement: if 'stop' equals n or N, then loop is set to false, ending the while statement and ending the program. 
            //Otherwise, loop stays equal to true, and the user is prompted to enter new values for A and B again.
            if (stop.equals("N") || stop.equals("n"))
            {
                loop = false;
            }
            else
            {
                loop = true;
            }
        }
    }
}