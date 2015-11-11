//imports the scanner class and the random class to be used in the program
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    //declares the main method 
    public static void main (String [] args) {
        //Initialization of both the Scanner 'scan' and Random 'generator'
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //prompts the user ot enter an integer for the size of the board('n')
        System.out.print("Enter the size of the board: ");
        int n = scan.nextInt();
        //creates a 2D int array 'sweeper', size 'n' by 'n'
        int [][] sweeper = new int [n][n];
        //sets every value in 'sweeper' equal to 0
        for (int v = 0; v < n; v++) {
            for (int h = 0; h < n; h++) {
                sweeper[h][v] = 0;
            }
        }
        //prompts the user to enter the number of mines to be placed randomly on the board('m')
        System.out.print("Enter the number of mines to placed on the board: ");
        int m = scan.nextInt();
        int beginning = 0;
        //runs until all the mines have been placed and all the surrounding spaces have been properly marked
        while (beginning < m) {
            int x = generator.nextInt(n);
            int y = generator.nextInt(n);
            //assigns a mine to a random place
            //Mines are denoted by the number 9
            //if a mine already occupies the place, then it creates a new random spot
            if (sweeper[x][y] != 9) {
                sweeper[x][y] = 9;
                beginning++;
            
                //runs through the 8 places surrounding the mine
                for (int i = x - 1; i <= x+1; i++) {
                    for (int j = y - 1; j <= y+1; j++) {
                        try {
                            //if the space is not another mine, then 1 is added to its value
                            if (sweeper[i][j] != 9) {
                                sweeper[i][j]++;
                            }
                        }
                        //if the space is off the board, this catch statement stops an out of bounds exception from crashing the program
                        catch(Exception e) {
                        }
                    }
                }
            }      
        }
        //creates a 2D string array 'game' of size 'n' by 'n'
        String[][] game = new String[n][n];
        //fills 'game' with basically the same values as 'sweeper'
        for (int g = 0; g < n; g++) {
            for (int a = 0; a < n; a++) {
                //the 0s in 'sweeper' are replaced by "_"s in 'game'
                if (sweeper[g][a] == 0) {
                    game[g][a] = "_";
                }
                //the Mines (9) are repaced by "M"
                else if (sweeper[g][a] == 9) {
                    game[g][a] = "M";
                }
                //the numbers marking how many mines are in close proximity are simply converted to string form
                else {
                    String str = "" + sweeper[g][a];
                    game[g][a] = str;
                }
            }
        }
        //prints out the Mine Sweeper board.
        for (int p = 0; p < n; p++) {
            for (int q = 0; q < n; q++) {
                System.out.print(" " + game[p][q] + " ");
            }
            System.out.println();
        }
       
        
    }
}