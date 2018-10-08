package com.ajnarayan.ds.strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationStrings {

    public static void main(String[] args){
        String a = "aab";
        String b = "bab";
        System.out.println(" The two string are of the same permutation : " + isPermutation(a,b));
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

    //TODO: sort and compare two; nlogn

}
