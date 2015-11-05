//import the random class to be used in the program
import java.util.Random;

public class lab11arrays {
    //declares the sort method to be used in the program
    //sorts an array from least to greatest.
    public static void sort(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            //if a value is greater than the one after it, the values are switched
            if (arr[i] > arr[i + 1]) {
                int x = arr[i];
                int y = arr[i + 1];
                arr[i] = y;
                arr[i + 1] = x;
                //if the values are switched, the for loop restarts
                //this makes sure a large value doesn't get stuck at the beginning of the loop.
                i = -1;
            }           
        }
        //prints out the array
        for (int x = 0; x < (arr.length - 1); x++) {
            System.out.print(arr[x] + ", ");
        }
        System.out.println();
        
    }
    //declares the main method
    public static void main (String []args) {
        //initializes the 'generator' instance of the Random class
        Random generator = new Random();
        //sets the size of array1 to 20
        int[] array1 = new int[20];
        //fills array 1 with 20 random numbers between 0 and 100
        for (int i = 0; i < 20; i++) {
            array1[i] = generator.nextInt(101);
        }
        //calls the sort method to sort array1
        sort(array1);
        //sets the size of array2 to 10
        int[] array2 = new int[10];
        //fills array2 with 10 random numbers between 0 and 100
        for (int j = 1; j < 10; j++) {
            array2[j] = generator.nextInt(101);
        }
        //calls the sort method to sort array2
        sort(array2);
        //creates array3 with a size of 30
        int[] array3 = new int[30];
        //makes the first 20 integers stored in array3 the values in array1
        for (int k = 0; k < 20; k++) {
            array3[k] = array1[k];
        }
        //makes the values 21-30 the values in array2
        for (int p = 20; p < 30; p++) {
            array3[p] = array2[p - 20];
        }
        //calls the sort method to sort array3
        sort(array3);
        
        
        
        
    }
}