//Given a 2D integer array matrix, return the transpose of matrix.
//
//        The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//
//
//
//
//        Example 1:
//
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [[1,4,7],[2,5,8],[3,6,9]]

//https://leetcode.com/problems/transpose-matrix/

package Arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        transpose(matrix);
    }

    static int[][] transpose(int[][] arr){
        int[][] transposeArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < transposeArr.length; i++) {
            for (int j = 0; j < transposeArr[0].length; j++) {
                transposeArr[i][j] = arr[j][i];
            }
        }
        return transposeArr;
    }
}
