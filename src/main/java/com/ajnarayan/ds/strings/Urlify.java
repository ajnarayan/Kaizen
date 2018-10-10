package com.ajnarayan.ds.strings;


/**
 * Given a string with spaces replace it with %20
 * eg. "Mr John Smith    " --> "Mr%20John%20Smith"
 */
public class Urlify {
    public static void main(String[] args) {
        String str = "Mr John Smith     ";
        int trueLength = 13;
        System.out.println(str.length());
        str = urlify(str.toCharArray(), trueLength);
        System.out.println(" The new String is : " + str);
        System.out.println(str.length());
    }

    /**
     * Time: O(n)
     * Space: O(1)
     * @param str
     * @param trueLength
     */
    private static String urlify(char[] str, int trueLength) {
        int index, spacecount = 0;
        for(int i =0 ; i< trueLength; i++){
            if(str[i] == ' '){
                spacecount++;
            }
        }

        index = trueLength + spacecount * 2;

        for(int i=trueLength-1; i>0 ; i--){
            if( str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }else{
                str[index - 1] = str[i];
                index--;
            }
        }

        return new String(str);
    }
}
