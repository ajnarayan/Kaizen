package com.ajnarayan.ds.strings;


/**
 * Given two strings, check if they are 1 insert, removal or replacement away from matching.
 */
public class OneEditAway {


    public static void main(String[] args) {
        String s1 = "Pale";
        String s2 = "Ple";
        System.out.println(" The two strings are one edit away : " + isOneEditAway(s1, s2));
    }

    private static boolean isOneEditAway(String s1, String s2) {

        if(s1.length() == s2.length()){
            return isOneReplacementAway(s1, s2);
        }else if(s1.length() + 1 == s2.length()){
            return isOneAway(s1, s2);
        }else if(s1.length() - 1 == s2.length()){
            return isOneAway(s2, s1); // send the longest string first
        }

        return false;
    }

    /**
     * s2 is shorter always
     * @param s1
     * @param s2
     * @return
     */
    private static boolean isOneAway(String s1, String s2) {
        int index1 =0 , index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }

        }

        return true;
    }

    private static boolean isOneReplacementAway(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
            index1++;
            index2++;
        }
        return foundDifference;
    }



}
