import java.util.Scanner;

public class TicTacToe {
    public static void print(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("|" + board[x][i] + "|");
            }
            System.out.println();
        }
    }
    
    
    public static int[] FreakinBossAI(int[][] board, int current) {
        //if (current == 2) {
            if (board[0][0] == 1) {
                int[] square = {2, 2};
                return square;
            }
            else if (board[2][2] == 1) {
                int[] square = {0, 0};
                return square;
            }
            else if (board[0][2] == 1) {
                int[] square = {2, 0};
                return square;
            }
            else if (board[2][0] == 1) {
                int[] square = {0, 2};
                return square;
            }
            else {
                int[] square = {0, 0};
                return square;
            }
        //}
        
            
        
    }
    
    public static int[] turn(int player) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player " + player + ", enter the column and row number:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] square = {x, y};
        return square;
    }
    public static boolean win(int player) {
        System.out.println("Player " + player + " WINS!!!!");
        for (int q = 0; q < 20; q++ ) {
            for (int t = 0; t < 20; t++) {
                
            }
        }
        boolean loop = false;
        return loop;
    }
    public static void main(String [] args) {
        int[][] board = new int[3][3];
        print(board);
        
        boolean loop = true;
        int turn = 1;
        while (loop) {
            int player = 0;
            int[] square = new int[2];
            if (turn%2 == 1) {
                player = 1;
                square = turn(player);
            }
            else {
                player = 2;
                square = FreakinBossAI(board, turn);
            }
            //int[] square = turn(player);
            int x = square[0];
            int y = square[1];
            if (board[x][y] == 0) {
                board[x][y] = player;
                turn++;
                print(board);
            }
            else {
                System.out.println("You can't go there silly.");
            }
            if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0) {
                loop = win(board[0][0]);
            }
            else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][1] != 0) {
                loop = win(board[1][1]);
            }
            else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] != 0) {
                loop = win(board[2][2]);
            }
            else if (board[0][0] == board[1][0] && board[1][0]== board[2][0] && board[0][0] != 0) {
                loop = win(board[0][0]);
            }
            else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[1][1] != 0) {
                loop = win(board[1][1]);
            }
            else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != 0) {
                loop = win(board[2][2]);
            }
            else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0) {
                loop = win(board[1][1]);
            }
            else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != 0) {
                loop = win(board[1][1]);
            }
            else {
                loop = true;
            }
            int a = 0;
            for (int i = 0; i < 3; i++) {
                for (int v = 0; v < 3; v++) {
                    if (board[i][v] != 0) {
                        a++;
                    }
                    else {
                        a = 0;
                    }
                }
            }
            if (a == 9) {
                loop = false;
                System.out.println("")
            }
        }
    }
}   