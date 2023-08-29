//Given an integer n, return any array containing n unique integers such that they add up to 0.
//
//
//
//        Example 1:
//
//        Input: n = 5
//        Output: [-7,-1,1,3,4]
//        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

package Arrays;

import java.util.Arrays;

public class SumToZero {
    public static void main(String[] args) {
        sumZero(4);
    }

    static int[] sumZero(int n) {
        int[] finArr = new int[n];
        if(n%2 != 0){
            finArr[0] = 0;
            for (int i = 1; i < n; i += 2) {
                finArr[i] = i;
                finArr[i+1] = -i;
            }
        }else {
            for (int i = 0; i < n; i += 2) {
                finArr[i] = i+1;
                finArr[i+1] = -(i+1);
            }
        }



        System.out.println(Arrays.toString(finArr));
        return finArr;
    }
}
