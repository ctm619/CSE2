import java.util.Scanner;
public class IDK {
    
    public static void main (String []args) {
        /*
        int array[] array = new int[10];
        int i = 0;
        while (i < array.length) {
            if (i%2 == 0) {
                array[i] = i * 2;
            }
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        */
        int[] array2 = new int[12];
        int j = 0;
        while (j<array2.length) {
            array2[j*2] = j;
            System.out.print(array2[j*2] + " ");
            j++;
        }
        /*
        System.out.println();
        
        int[] list1 = {1, 2, 3};
        int[] list2 = list1;
        list2[0] = 5;
        for (int y = 0; y < 3; y++) {
            System.out.print(list1[y] + " ");
        }
        */
    }
}