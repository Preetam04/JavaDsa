//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//        Specifically, ans is the concatenation of two nums arrays.
//
//        Return the array ans.

//https://leetcode.com/problems/concatenation-of-array/
package Arrays;

import java.util.Arrays;

public class ConcatenationArr {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5};
        Concatenate(arr);

    }

    static int[] Concatenate(int[] arr){
        int n = arr.length;
        int[] finArr = new int[2*n];
        System.out.println(finArr.length);
        for(int i = 0; i<= finArr.length-1; i++){
            if(i >= arr.length){
//                System.out.println(i- (arr.length) );
                finArr[i] = arr[i- (arr.length)];
            }else{
                finArr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(finArr));

        return finArr;
    }
}
