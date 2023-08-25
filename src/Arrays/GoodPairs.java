//Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

//https://leetcode.com/problems/number-of-good-pairs/

package Arrays;

import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        pairs(nums);
    }

    static int pairs(int[] nums){
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i<j){
                    pair += 1;
                }
            }
        }
//        System.out.println(pair);

        return pair;
    }
}
