//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package Functions;

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = in.nextInt();
        if(eligibleForVoting(age)){
            System.out.println("You are eligible For Voting!");
        }else{
            System.out.println("You are not eligible For Voting!");
        }
    }

    static boolean eligibleForVoting(int age){
        return age >= 18;
    }
}
