package com.ajnarayan.ds.strings;

public class PermutationPalindrome {

    public static void main(String[] args) {
        String input = "Tact Coa";
        System.out.println(" The string is Palindrome Permutation ?: " + isPalindromePerm(input));
    }

    private static boolean isPalindromePerm(String input) {
        int[] charMap = new int[(int)'z' - (int)'a' + 1];

        for(char c : input.toLowerCase().toCharArray()){
            if(c <= 'z' && c >= 'a'){
                charMap[c - 'a']++;
            }
        }

        boolean foundOdd = false;
        for(int i=0; i<charMap.length; i++){
            if(charMap[i] % 2 ==1) {
                if(foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return foundOdd;
    }
}
