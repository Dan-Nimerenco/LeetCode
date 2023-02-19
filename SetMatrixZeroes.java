package LeetCode.LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SetMatrixZeroes {

    public static void main(String[] args){
        int[][] matricea = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        setZeroes(matricea);
    }


    public static void setZeroes(int[][] matrix) {
        int[] zeroRow = new int[matrix[0].length];
        int colIndex=0;
        Arrays.fill(zeroRow,0);
        Deque<Integer> zeroPlacement = new ArrayDeque<>();
        for (int i = 0; i<= matrix.length-1;i++){
            for (int j =0; j<= matrix[0].length-1;j++){
                if (matrix[i][j] == 0){
                    zeroPlacement.push(j);
                    zeroPlacement.push(i);
                }
            }
        }
        while (!zeroPlacement.isEmpty()){
            matrix[zeroPlacement.pop()] = zeroRow;
            colIndex = zeroPlacement.pop();
            for (int[] i : matrix){
                i[colIndex] = 0;
            }
        }
    }
}
