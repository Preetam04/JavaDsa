//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
//        A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//
//
//
//        Example 1:
//
//        Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//        Output: [15]
//        Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/


//https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] arr1 = {{3,6},{7,1},{5,2},{4,8}};
//        [[3,6],[7,1],[5,2],[4,8]]
        lucky(arr1);

    }

    static List<Integer> lucky(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mi[i] == mx[j])  {
                    res.add(mi[i]);
                }
            }
        }
        return res;
    }
}
