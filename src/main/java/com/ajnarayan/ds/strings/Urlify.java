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
        char[] strChar = urlify(str.toCharArray(), trueLength);
        System.out.println(" The new String is : \n");
        for(int i=0 ; i<strChar.length; i++) {
            System.out.print(strChar[i]);
        }
        System.out.println("\n" + strChar.length);
    }

    /**
     * Time: O(n)
     * Space: O(1) - Inplace since not using string
     * @param str
     * @param trueLength
     */
    private static char[] urlify(char[] str, int trueLength) {
        int index, spacecount = 0;
        //count the number of spaces
        for(int i =0 ; i< trueLength; i++){
            if(str[i] == ' '){
                spacecount++;
            }
        }

        //the new length to start filling from reverse
        index = trueLength + spacecount * 2;

        //append \0 to indicate the end
        if(trueLength< spacecount){
            str[index--] = '\0';
        }
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

        return str;
    }
}
