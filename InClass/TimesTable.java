import java.util.Scanner;

public class TimesTable {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the highest number: ");
        int n = scan.nextInt();
        System.out.print("*  | ");
        for (int v = 1; v <= n; v++)
        {
            if (v < 10) {
                System.out.print(v + "   ");
            }
            else {
                System.out.print(v + "  ");
            }
        }
        System.out.println();
        int go = 5 + (4*n);
        for (int g = 1; g <= go; g++)
        {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            if (i < 10) {
                System.out.print(i + "  | ");
            }
            else {
                System.out.print(i + " | ");
            }
            for (int j = 1; j <= n; j++)
            {
                if (j*i < 10) {
                    System.out.print((j*i) + "   ");
                }
                else if (j*i < 100) {
                    System.out.print((j*i) + "  ");
                }
                else {
                    System.out.print((j*i) + " ");
                }
            }
            System.out.println();
        }
    }
}