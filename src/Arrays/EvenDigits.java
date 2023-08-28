//Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


package Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        digit(nums);

    }

    static int digit(int[] arr){
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
////            String s = String.valueOf(arr[i]);
////            int n = s.length();
//            int n = (String.valueOf(arr[i])).length();
//            if(n % 2 == 0){
//                count++;
//            }
//        }

        for ( int num : arr) {
            int n = (String.valueOf(num)).length();
            if(n % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
