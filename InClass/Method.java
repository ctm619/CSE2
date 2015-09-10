public class Method {
    
    static int count = 0;
    public static void computeSpeed() {
        float processorSpeed;
        byte numberProcessor;
        float computerSpeed;
        
        processorSpeed = 2.3f;
        numberProcessor = 3;
        
        computerSpeed = processorSpeed * numberProcessor;
        count = 5;
        System.out.println("Computer Speed: " + computerSpeed);
        System.out.println("Count: " + count);
        
    }
    
    
    public static void main(String[]args) {
        computeSpeed();
        count = 10;
        System.out.println("Count: " + count);
        
        
    }
}