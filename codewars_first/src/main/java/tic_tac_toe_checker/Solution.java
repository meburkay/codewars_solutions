package tic_tac_toe_checker;

public class Solution {

    public static void main(String[] args) {

        int[][] array = {{1,2,1},{2,2,0},{0,2,2}};
        System.out.println(isSolved(array));
    }


    public static int isSolved(int[][] board) {



        boolean xWins = checkWinner(1,board);
        boolean oWins = checkWinner(2,board);
        boolean emptySpots = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    emptySpots = true;
                    break;
                }
            }
        }

        if (xWins) {
            return 1;
        } else if (oWins) {
            return 2;
        } else if (emptySpots) {
            return -1;
        } else {
            return 0;
        }
    }
    static boolean checkWinner(int player,int[][] board) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Check row
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Check column
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check diagonal
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Check anti-diagonal
        }
        return false;
    }
}
/*
https://www.codewars.com/kata/525caa5c1bf619d28c000335

If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
We want our function to return:

-1 if the board is not yet finished AND no one has won yet (there are empty spots),
1 if "X" won,
2 if "O" won,
0 if it's a cat's game (i.e. a draw).
You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.

ARRAYSALGORITHMS
 */
