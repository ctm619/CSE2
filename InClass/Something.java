//overload with types, parameters, or sequence
//return type does not affect overloading
//ARRAYS!!!!!!!!!!!
//
public class Something {
    public static int linsearch(int[] arr, int target, int pos) {
        if (pos == arr.length) {
            return -1;
        }
        else if (arr[pos] == target) {
            return pos;
        }
        else {
            return (linsearch(arr, target, pos +1));
        }
    }
    public static void main (String []args) {
    //linear search
    //int[] array1 = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
    //System.out.println(linsearch(array1, 19, 0));
    //binary search
    //sorted array for a binary search
    String[][] arr;
    arr = new String[5][5];
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            arr[i][j] = "o";
        }
        
    }
    int numBombs = 0;
    while (numBombs < 3) {
        int x = (int)Math.random() * 5;
        int y = (int)Math.random() * 5;
        if (!arr[x][y].equals("M")) {
            arr[x][y] = "M";
            numBombs = numBombs + 1;
        }
        
    }
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[i][j] + "/t ");
        }
        System.out.println();
    }
        
    }
}