package Assignment_4;

import java.util.*;
public class k_knights{
        static int j = 0;
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();
            boolean board[][] = new boolean[p][p];
            positions(board, p, -1);
            System.out.println("\n" + j);
        }

        public static void positions(boolean[][] board, int n, int l){
            if(n == 0){
                j++;
                display(board);
                return;
            }
            for (int i = l + 1; i< board.length * board.length; i++) {
                int r = i / board.length;
                int c = i % board.length;

                if (!board[r][c] && isSafe(board, r, c)) {
                    board[r][c] = true;
                    positions(board, n-1, r * board.length + c);
                    board[r][c] = false;
                }
            }

        }

        public static boolean isSafe(boolean[][] board, int i, int c){
            if(i - 2 >= 0 && c - 1 >= 0 &&  board[i-2][c-1])
                return false;

            if(i - 1 >= 0 && c - 2 >= 0 &&  board[i - 1][c - 2])
                return false;

            if(i - 1 >= 0 && c + 2 < board.length &&  board[i - 1][c + 2])
                return false;

            if(i - 2 >= 0 && c + 1 < board.length &&  board[i - 2][c+ 1])
                return false;

            return true;

        }

        public static void display(boolean[][] board){
            for(int x = 0; x < board.length; x++){
                for(int y = 0; y < board[0].length; y++){
                    if(board[x][y])
                        System.out.print("{" + x + "-" + y + "} ");
                }

            }
            System.out.print(" ");
        }
    }
