import java.util.Scanner;
import java.util.Random;

public class Add {
    
    public static void main(String[]args) {
        int[] a = {10, 8, 3, -4, 0, 1, 100, 50, 22, -5};
        for (int i = 1; i < 6; i++ ) {
            for (int j = i; (j > 0 && (a[j] < a[j-1])); j--) {
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
        }
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    } 
}