package LeetCode.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int marimeMatrice = matrix[0].length-1;
        Deque<Integer> lista = new ArrayDeque<>();
        for (int j=0;j<=marimeMatrice;j++){
            for (int i=marimeMatrice;i>=0;i--){
                lista.offer(matrix[i][j]);
            }
        }
        for (int i=0;i<=marimeMatrice;i++){
            for (int j=0;j<=marimeMatrice;j++){
                matrix[i][j] = lista.pop();
            }
        }
    }
}
