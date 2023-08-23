package Functions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        if(num<0){
            System.out.println("Not a Natural Number!");
        }

        System.out.println("The Sum of Natural Number is: "+ Sum(num));
    }

    static int Sum(int n){
        int sum= 0;

        for(int i = n; i >0; i--){
            sum = sum + i;
        }

        return sum;
    }
}
