//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

package Functions;

import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 Number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(IsTriplet(num1, num2, num3)){
            System.out.println("The Number "+num1+" "+num2+" "+num3+" are Pythagorian Triplet!");
        }else{
            System.out.println("The Number "+num1+" "+num2+" "+num3+" are not Pythagorian Triplet!");
        }

    }

    static boolean IsTriplet(int num1, int num2, int num3){
        int sum  = (num1*num1) + (num2*num2);
        System.out.println(sum);
        if(sum == (num3*num3)){

            return true;
        }else{
            return false;
        }


    }

}
