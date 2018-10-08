package com.ajnarayan.ds.strings;

public class UniqueStrings {

    /**
     * Time O(n)
     * Space O(1)
     * @param input
     * @return
     */
    private static boolean isUnique(String input){
        boolean isUniqueString = true;
        if(input != null && input.length() >= 2){
            boolean[] charBooleanMapper = new boolean[128];
            for(char c: input.toCharArray()){
                if(charBooleanMapper[(int) c]){
                    isUniqueString = false;
                    break;
                }else{
                    charBooleanMapper[(int) c]= true;
                }
            }
        }
        return isUniqueString;

    }

    public static void main(String[] args){
        String a = "Lets Go!";
        System.out.println("testing uniquness for \"" + a +"\" : " + isUnique(a));
    }

}
