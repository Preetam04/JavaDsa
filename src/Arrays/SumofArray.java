//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.

//https://leetcode.com/problems/running-sum-of-1d-array/

package Arrays;

import java.util.Arrays;

public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        runningSum(arr);

    }

    static int[] runningSum(int[] nums){
        int[] arr = new int[nums.length];

        for(int i =0; i< arr.length; i++){
            if(i == 0){
                arr[i]= nums[i];

            }else{
                arr[i] = nums[i] + arr[i-1];
            }
        }
        return arr;
    }
}
