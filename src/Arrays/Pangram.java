//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/


package Arrays;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String str = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(IsPangram(str));
    }

    static boolean IsPangram(String str){
        for (int i=97;i<=122;i++)
        {
            if(str.indexOf((char)i)<0)
            {
                return false;
            }
        }
        return true;
    }
}
