import java.util.Scanner;
import java.util.Random;

public class Add {
    public static void main(String[]args) {
       Scanner scan = new Scanner(System.in);
       Random generator = new Random();
       System.out.print("Press 1 to play the Hi-Low Game: ");
       int play = scan.nextInt();
       int num = 0;
       int guess = 0;
       while (play == 1)
       {
           num = generator.nextInt(100) + 1;
           System.out.print("Guess a number between 1 and 100: ");
           guess = scan.nextInt();
           while (guess != num)  {
               if (guess > num) {
                   System.out.println("That number was too high!");
               }
               else {
                   System.out.println("That number was too low!");
               }
               System.out.print("Guess again! ");
               guess = scan.nextInt();
           }
           System.out.println("You guessed the number!");
           System.out.println("You guessed " + guess + " and the number was " + num + ".");
           System.out.print("To play again enter 1: ");
           play = scan.nextInt();
       }
        
    }
}