//ake in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package FirstJava;

import java.util.Scanner;

public class BassicCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Number2: ");
        int num2 = in.nextInt();
        System.out.println("Enter the operator: ");
        char operator = in.next().trim().charAt(0);

        Calculator(num1, num2, operator);
    }

    static int Calculator(int num1, int num2, char operator){
        int ans = 0;
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            // input two numbers

            if (operator == '+') {
                ans = num1 + num2;
                System.out.println(ans);
            }
            if (operator == '-') {
                ans = num1 - num2;
                System.out.println(ans);
            }
            if (operator == '*') {
                ans = num1 * num2;
                System.out.println(ans);
            }
            if (operator == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                    System.out.println(ans);
                }
            }
            if (operator == '%') {
                ans = num1 % num2;
                System.out.println(ans);
            }
        }  else {
            System.out.println("Invalid operation!!");
        }
        return ans;
    }


}
