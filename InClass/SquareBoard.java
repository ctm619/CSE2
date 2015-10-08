import java.util.Scanner;

public class SquareBoard {
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        for (int a = 1; a <=n; a++)
        {
            for (int hash = 1; hash <= n; hash++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}