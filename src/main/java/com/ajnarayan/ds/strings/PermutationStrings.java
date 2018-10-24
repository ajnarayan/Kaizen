package com.ajnarayan.ds.strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationStrings {

    public static void main(String[] args){
        String a = "aab";
        String b = "bab";
        System.out.println(" The two string are of the same permutation : " + permutation(a,b));
    }

    /**
     * Time O(n)
     * Space O(n)
     * @param a
     * @param b
     * @return
     */
    private static boolean isPermutation(String a, String b) {
        boolean isStringsPermutation = true;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        if( a != null && b != null){
            if(a.length() != b.length()){
                isStringsPermutation = false;
            }else{
                for(char c : a.toCharArray()){
                    if(characterIntegerMap.containsKey(c)) {
                        int count = characterIntegerMap.get(c);
                        characterIntegerMap.put(c, count++);
                    }else{
                        characterIntegerMap.put(c, 1);
                    }
                }

                for(char c : b.toCharArray()){
                    if(!characterIntegerMap.containsKey(c)){
                        isStringsPermutation = false;
                        break;
                    }else{
                        int count = characterIntegerMap.get(c);
                        characterIntegerMap.put(c, count--);
                    }
                }

                for(Map.Entry<Character, Integer> map : characterIntegerMap.entrySet()){
                    if(map.getValue() != 0){
                        isStringsPermutation = false;
                    }
                }
            }
        }
        return isStringsPermutation;
    }


    /**
     * Time O(n)
     * space O(1)
     * @param a
     * @param b
     * @return
     */
    private static boolean permutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] charAsciiCount = new int[128];

        for(char c : a.toCharArray()){
            charAsciiCount[c]++;
        }

        for(char c : b.toCharArray()){
            charAsciiCount[c]--;
            if(charAsciiCount[c] <0){
                return false;
            }
        }

        return true;
    }

    //TODO: sort and compare two; nlogn

}
