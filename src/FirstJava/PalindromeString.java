//To find out whether the given String is Palindrome or not.

package FirstJava;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = in.nextLine();

        boolean result = PalindromeStr(str);
        System.out.println(result);

    }

    static boolean PalindromeStr(String str){
        String revStr = "";

        for (int j = str.length()-1 ; j >=0; j--){
            revStr  = revStr +  str.charAt(j);

        }
        System.out.println(str.equals(revStr));
        if(str.equals(revStr) ){
            return true;
        }else{
            return false;
        }

    }
}
