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
        int revNum = 0;
        int n = num;

        while(n%10!=0){
            revNum = (revNum*10) + (n%10) ;
            n= n/10;
        }

        if(num == revNum){
            return true;
        }else{
            return false;
        }

    }
}
