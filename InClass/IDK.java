import java.util.Scanner;
public class IDK {
    
    public static void main (String[]args) {
        int a = 2;
        int b = 5;
        System.out.println(method(a, b));
    }
    public static int method(int a , int b) {
        int c = b-a;
        int m = a;
        for (int x = 1; x <= c; x++) {
             m =  m* (a+x);
        }
        return m;
    }
}