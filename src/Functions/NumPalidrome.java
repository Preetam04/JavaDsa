//Write a function to find if a number is a palindrome or not. Take number as parameter.
package Functions;

import java.util.Scanner;

public class NumPalidrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        if(isPalindrome(num)){
            System.out.println("Your Number is Palindrome!");
        }else{
            System.out.println("Your Number is not a Palindrome!");
        }
    }

    static boolean isPalindrome(int num){
        String s = String.valueOf(num);
        int n = s.length();

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;

    }
}
