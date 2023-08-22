package Functions;

import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 Number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        MaxNum(num1 ,num2 , num3);
        MinNum(num1 ,num2 , num3);
    }

    static int MaxNum(int num1, int num2, int num3){
        int max = num1;
        if(max<num2){
            max= num2;
        }

        if(max<num3){
            max = num3;
        }
        System.out.println(max);
        return max;
    }

    static int MinNum(int num1, int num2, int num3){
        int min = num1;
        if(min>num2){
            min= num2;
        }

        if(min>num3){
            min = num3;
        }
        System.out.println(min);

        return min;
    }

}
