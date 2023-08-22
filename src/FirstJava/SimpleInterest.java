//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        float Principle = in.nextFloat();
        System.out.println("Enter the time: ");
        float time = in.nextFloat();
        System.out.println("Enter the rate: ");
        float rate = in.nextFloat();
        float simpleInterest = SimpleInterestCalculator(Principle, time, rate);
        System.out.println(simpleInterest);



    }

    static float SimpleInterestCalculator(float Princple, float time, float rate){
        float si;
        si = (Princple*time*rate)/100;

        return si;
    }


}
