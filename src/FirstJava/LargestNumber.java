//Take 2 numbers as input and print the largest number

package FirstJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two Number : ");
        int num1 = in.nextInt();
        int num2 =  in.nextInt();
        LargerNumber(num1, num2);
    }

    static int LargerNumber(int num1, int num2){
        int largerNum = num1;
        if(num1<num2){
            largerNum = num2;
        }
        System.out.println("The larger number is: " + largerNum);

        return largerNum;
    }
}
