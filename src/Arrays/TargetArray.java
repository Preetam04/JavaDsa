//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//        Initially target array is empty.
//        From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//        Repeat the previous step until there are no elements to read in nums and index.
//        Return the target array.
//
//        It is guaranteed that the insertion operations will be valid.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

//https://leetcode.com/problems/create-target-array-in-the-given-order/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] ind = {0,1,2,2,1};
        CreateTargetArray(arr, ind);
    }

    static int[] CreateTargetArray(int[] values , int[] index){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] finArr = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            arr.add(index[i], values[i]);
        }
        for (int j = 0; j < index.length; j++) {
            finArr[j] = arr.get(j);
        }

//        System.out.println(Arrays.toString(finArr));

        return finArr;
     }
}
