package com.ajnarayan.ds.strings;


/**
 * Given a string compress it by counting the repeating char.
 */
public class StringCompress {

    public static void main(String[] args) {
        String s1  = "aaaaabbbbcccaaadd";
        System.out.println("The string compressed = " + compress(s1));
    }

    public static String compress(String s1) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            count++;

            if(i+1 >= s1.length() || s1.charAt(i+1) != s1.charAt(i)){
                sb.append(s1.charAt(i));
                sb.append(count);
                count = 0;
            }
        }

        return (sb.length() > s1.length()) ? s1 : sb.toString();
    }


}
