package FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        fibCalc(n);

    }

    static int fibCalc(int n){
        if(n == 0){
            return -1;
        }
        int a = 0;
        int b = 1;
        int temp;

        if(n == 1){
            System.out.println(a);

        }

        if(n > 2){
            System.out.println(a);
            System.out.println(b);

        }

        for(int i = 2; i<=n; i++){
            temp = a + b;
            System.out.println(temp);
            a = b;
            b= temp;


        }

        return 0;

    }
}
