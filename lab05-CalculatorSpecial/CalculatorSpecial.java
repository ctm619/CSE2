import java.util.Scanner;

public class CalculatorSpecial {
    public static void main(String []args) {
         //creates the instance of the scanner class 'scan' that is used in the program
        Scanner scan = new Scanner(System.in);
        
       
        
        boolean loop = true;
        
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
            System.out.print("Press N or n to stop, press anything else to continue: ");
            String stop = scan.next();
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