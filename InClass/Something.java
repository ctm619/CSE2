

public class Something {
    public static void overload1(int x) {
        System.out.println("x = " + x);
    }
    public static void overload1(boolean x) {
        System.out.println("x = " + x);
    }
    public static void overload2(int x) {
        System.out.println(x);
    }
    public static void overload2(int x, int y) {
        System.out.println(x + ", " + y);
    }
    public static void main (String []args) {
        
        overload2(5);
        overload2(5, 10);
    }
}