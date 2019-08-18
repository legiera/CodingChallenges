package algoexpert.Strings;


//Palindrome Check
//        Write a function that takes in a non-empty string and that returns a boolean representing whether or not the string is a palindrome. A palindrome is
//        dened as a string that is written the same forward and backward.

public class Palindrome {
    // O(n) time | O(1) space
    public static boolean isPallindrome(String str){
        int leftIdx =0;
        int righIdx = str.length()-1;

        while(leftIdx < righIdx){
            if(str.charAt(leftIdx) != str.charAt(righIdx)){
                return false;
            }
            leftIdx++;
            righIdx--;
        }
        return true;
    }
}
