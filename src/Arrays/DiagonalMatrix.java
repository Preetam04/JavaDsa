//Given a square matrix mat, return the sum of the matrix diagonals.
//
//        Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
//
//
//
//        Example 1:
//
//
//        Input: mat = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//        Output: 25
//        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//        Notice that element mat[1][1] = 5 is counted only once.


//https://leetcode.com/problems/matrix-diagonal-sum/



package Arrays;

import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int m= 2;
        int n= 3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        diagonalSum(matrix);

    }

    static int diagonalSum( int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(i==j){
                    sum += matrix[i][j];
                }
                if(i + j == matrix.length-1 && i != j){
                    System.out.println(i+j);
                    System.out.println(matrix.length-1);
                    sum += matrix[i][j];
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }


        return sum;
    }

}
