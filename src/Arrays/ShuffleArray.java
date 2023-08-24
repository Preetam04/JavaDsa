//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//
//
//        Example 1:
//
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

//https://leetcode.com/problems/shuffle-the-array/


package Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        shuffle(nums, n);
    }

    static int[] shuffle(int[] nums, int n) {
        int[] finArr = new int[nums.length];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i<=finArr.length-1; i++){
            if(i<n){
                arr1[i] = nums[i];
            }else{
                arr2[i-n] = nums[i];
            }
        }

        for(int i = 0; i<n; i++){
            finArr[(i*2)] = arr1[i];
            finArr[(i*2)+1] = arr2[i];
        }

        return finArr;
    }
}
