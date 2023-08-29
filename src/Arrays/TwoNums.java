//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//https://leetcode.com/problems/two-sum/solutions/3619262/3-method-s-c-java-python-beginner-friendly/

package Arrays;

public class TwoNums {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int n = 6;
        twoNums(arr, n);
    }

    static int[] twoNums(int[] nums,int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target && j>i){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

}
