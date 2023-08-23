//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        System.out.println("Factorial of "+num+" is "+ NumFactorial(num));

    }

    static int NumFactorial(int num){
        int factorial=1;
        if(num == 0){
            factorial = 1;
        }
        for(int i = num; i>0; i--){
            factorial = factorial * i;

        }

//        System.out.println(factorial);

        return factorial;
    }
}
