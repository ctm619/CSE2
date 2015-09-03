import java.util.Scanner;

public class Bank {
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input the balance: ");
        double balance = scan.nextDouble();
        System.out.println("Input the interest rate: ");
        double interest = scan.nextDouble();
        double totalInterest = balance * interest;
        int Int = (int) totalInterest;
        double newBalance = balance + Int;
        System.out.println("The new balance is $" + newBalance);
    }
}