import java.util.Scanner;
import java.util.Random;

public class Add {
    int a = 2;
    
    public void setA(int x) {
        a = x;
    }
    public int geta() {
        return a;
    }
    
    public static void main(String[]args) {
        Add d = new Add();
        d.setA(12);
        System.out.println(d.geta());
    }
    
    
}