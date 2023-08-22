//Input currency in rupees and output in USD.

package FirstJava;

import java.util.Scanner;

public class INRToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency in INR : ");
        float num1 = in.nextInt();
        System.out.println("Your money in USD is " + ToUSD(num1));
    }

    static double ToUSD(float INR){
        double usd;
        usd = INR*0.012;

        return usd;
    }
}
