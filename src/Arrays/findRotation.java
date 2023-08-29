//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
//
//
//
//        Example 1:
//
//
//        Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
//        Output: true
//        Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.


//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/solutions/3276025/determine-whether-matrix-can-be-obtained-by-rotation/

package Arrays;

import java.util.Arrays;

public class findRotation {
    public static void main(String[] args) {
        int[][] num = {{0,0}, {1,1}};
        int[][] target = {{0,1}, {0,1}};
        rotation(num, target);
    }

    static boolean rotation(int[][] mat, int[][] target) {
        int row = mat.length;

        for(int k=0;k<=3;++k){
            int[][] r = new int[row][row];
            for(int i =0;i<row;++i){
                for(int j =0;j<row;++j){
                    r[j][row-1-i]=mat[i][j];
                }
                if(Arrays.deepEquals(r,target)){
                    return true;
                }
            }
            mat = r;
        }
        return false;
    }


}
