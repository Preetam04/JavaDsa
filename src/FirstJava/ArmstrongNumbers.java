//To find Armstrong Number between two given number.

package FirstJava;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();

        boolean result = IsArmStrong(num);
        System.out.println(result);
    }

    static boolean IsArmStrong(int num){
        int temp = 0;
        int n = num;

        while(n>0){
            if(n % 10 != 0){
                int x = n%10;
//                System.out.println(x);
                temp =temp +  x*x*x;
//                System.out.println(temp);
            }
            n = n / 10;
        }

        if(temp == num ){
            return true;
        }else{
            return false;
        }

    }

}
