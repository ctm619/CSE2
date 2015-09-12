import java.util.Scanner;

public class Timer {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the current time: ");
        int start = scan.nextInt();
        System.out.println("Enter the time that you will be eating dinner: ");
        int end = scan.nextInt();
        int time = end - start;
        int hours = (int)(time / 100);
        int minutes = (int)(time % 100);
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    }
}