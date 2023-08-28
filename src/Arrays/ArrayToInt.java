//The array-form of an integer num is an array representing its digits in left to right order.
//
//        For example, for num = 1321, the array form is [1,3,2,1].
//        Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//
//
//
//        Example 1:
//
//        Input: num = [1,2,0,0], k = 34
//        Output: [1,2,3,4]
//        Explanation: 1200 + 34 = 1234




package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToInt {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        addToArrayForm(num , k);
    }


    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> finArr = new ArrayList<>();
        int carry = k;

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            finArr.add(0, sum % 10);  // Adding the least significant digit at the beginning
            carry = sum / 10;          // Updating the carry
        }
        System.out.println(finArr);
        while (carry > 0) {
            finArr.add(0, carry % 10);
            carry /= 10;
        }
        return finArr;

    }
}




//        String s = String.valueOf(m);
//        char[] arr = s.toCharArray();
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(+arr[i]);
//            finArr.add(+arr[i]-48);
//        }
//        System.out.println(finArr);
