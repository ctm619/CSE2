//import the Random class to be used in the program.
import java.util.Random;
//import the Scanner class to be used in the program.
import java.util.Scanner;

//creates the coin flipping class
public class CoinFlipping {
    //declares the 'flip' method that only flips one coin
    public static void flip() {
        //creates the generator instance of the Random class to be used in 'flip'
        Random generator = new Random();
        //generates a random int(HeadsOrTails) between 0 and 1.
        int hot = generator.nextInt(2);
        //if hot = 0, then the flip was heads
        if (hot == 0) {
            System.out.println("The coin was heads, " + hot);
        }
        //if hot = 1, then the flip was tails
        else {
            System.out.println("The coin was tails, " + hot);
        }
    }
    //declares the 'flip' method that can flip the coin multiple times
    public static void flip(int n) {
        //creates the instance of the Rnadom class to be used in the program
        Random generator = new Random();
        int tails = 0;
        int heads = 0;
        //Flips a coin for 'n' number of times
        for (int num = 1; num <= n; num++) {
            //generates a random number, either 0 or 1
            int hot = generator.nextInt(2);
            //if hot = 0, then 1 is added to the total number of heads
            if (hot == 0) {
                heads++;
            }
            //if hot = 1, then 1 is added to the total number of tails
            else {
                tails++;
            }
        }
        //prints out the total number of flips that were heads, and the total number of flips that were tails.
        //both numbers should add up to n.
        System.out.println("The total number of flips that returned heads: " + heads);
        System.out.println("The total number of flips that returned tails: " + tails);
    }
    //declares the main method of the CoinFlipping class
    public static void main (String[]args) {
        //declares the scan instance of the scanner class to be used in the program
        Scanner scan = new Scanner(System.in);
        //sets the boolean value 'loop' to true
        boolean loop = true;
        //prompts the user to enter certain values for a certain result.
        System.out.println("Enter zero to flip the coin once.");
        System.out.println("Enter any number between 1 and 100 to flip the coin that many times.");
        System.out.println("Enter a number above 100 to quit.");
        //while 'loop' is true, the loop runs
        while (loop) {
            //sets the variable 'coin' equal to the value enetered previously by the user.
            int coin = scan.nextInt();
            //if 'coin' = 0, the 'flip' method is called that only flips one coin.
            if (coin == 0) {
                flip();
                loop = true;
            }
            //if 'coin' is between 1 and 100, the 'flip' method is called that flips multiple coins.
            //'flip' sets n = coins, so the number entered is the number of flips
            else if (coin >= 1 && coin <= 100) {
                flip(coin);
                loop = true;
            }
            //if a value greater than 100 is enetered, 'loop' is set to false, and the program exits the while loop.
            else {
                loop = false;
            }
        }
        
    }
}