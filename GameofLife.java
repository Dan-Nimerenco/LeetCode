package LeetCode.LeetCode;

import java.util.Arrays;

public class GameofLife {
    public static void main(String[] args){
        int[][] matricea = {{1,0,0,1}};
        gameOfLife(matricea);
        for (int[] i: matricea){
            System.out.println(Arrays.toString(i));
        }
    }

//    public static int[][] nextGameStep(int[][] board){
//
//    }

    public static void gameOfLife(int[][] board) {
        if (board.length==1 && board[0].length==1){
            board[0][0]=0;
            return;
        }
        if (board.length==1){
            for (int i=0;i<= board[0].length-1;i++){
                board[0][i] = 0;
            }
            return;
        }
        if (board[0].length==1){
            for (int i=0 ;i<=board.length-1;i++){
                board[i][0]=0;
            }
            return;
        }
        int rowSize = board.length-1;
        int columnSize = board[0].length-1;
        int[][] example = new int[rowSize+1][columnSize+1];
        int check=0;
        for (int i =0; i<= rowSize;i++){
            for (int j=0;j<=columnSize;j++){
                if (i==0 && j==0){
                    check = board[0][1] + board[1][1]+board[1][0];
                }
                else if (i==rowSize && j==0){
                    check = board[rowSize-1][0] + board[rowSize-1][1]+board[rowSize][1];
                }
                else if (i==0 && j==columnSize){
                    check = board[0][columnSize-1] + board[1][columnSize]+board[1][columnSize-1];
                }
                else if(i==rowSize && j==columnSize){
                    check = board[rowSize-1][columnSize-1] + board[rowSize][columnSize-1]+board[rowSize-1][columnSize];
                }
                else if(i==0){
                    check = board[0][j-1] + board[0][j+1]+board[1][j-1]+board[1][j]+board[1][j+1];
                }
                else if (i==rowSize){
                    check = board[rowSize][j-1] + board[rowSize][j+1]+board[rowSize-1][j-1]+board[rowSize-1][j]+
                            board[rowSize-1][j+1];
                }
                else if (j==0){
                    check = board[i-1][j] + board[i+1][j]+board[i-1][j+1]+board[i][j+1]+ board[i+1][j+1];
                }
                else if (j==columnSize){
                    check = board[i-1][j] + board[i+1][j]+board[i-1][j-1]+board[i][j-1]+ board[i+1][j-1];
                }
                else {
                    check = board[i-1][j-1] + board[i-1][j]+board[i-1][j+1]+board[i][j-1]+
                            board[i][j+1]+board[i+1][j-1]+ board[i+1][j]+board[i+1][j+1];
                }
                if (board[i][j] == 1){
                    if (check<2 || check>3) {
                        example[i][j] = 0;
                    }
                    else {
                        example[i][j] = 1;
                    }
                }
                if (board[i][j] == 0 && check ==3){
                    example[i][j] = 1;
                }
            }
        }
        for (int i=0;i<=rowSize;i++){
            for (int j=0;j<=columnSize;j++){
                board[i][j]=example[i][j];
            }
        }
    }

//    Any live cell with fewer than two live neighbors dies as if caused by under-population.
//    Any live cell with two or three live neighbors lives on to the next generation.
//    Any live cell with more than three live neighbors dies, as if by over-population.
//    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

}
