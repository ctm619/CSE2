public class Method {
    public static void hw () {
        System.out.println("Hello World!!");
    }
    public static void add (int a, int b) {
        System.out.println("add= " + (a+b));
    }
    //if a mthod is returning a value, replace 'void' with the type of variable
    //such as int, double, char, String...
    public static int ad (int a, int b) {
        return a+b;
    }
    //this method is returning true or flase, so boolean is stated in the method
    public static boolean isMult2 (int a) {
        if (a%2 ==0) {
            return true;}
        else{
            return false;}
    }
    public static String Hello(String s) {
        return "Hello    " + s; 
    }
    public static void main (String []args) {
        //printing in the main method
        System.out.println("Hello World!");
        //executing the hw method
        hw();
        int x = 3, y = 8;
        add(x, y);
        
        int c = ad(x, y);
        System.out.println(c);
        System.out.println(isMult2(c));
        //public static (return statement)
        //void means nothing is returned
        //int means an int is returned, double means a double is returned, and so on
        System.out.println(Hello("World"));
    }
}