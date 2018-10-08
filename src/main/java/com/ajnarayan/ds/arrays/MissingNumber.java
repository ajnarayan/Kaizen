package com.ajnarayan.ds.arrays;

/**
 * You are given a list of n-1 integers and these integers are in the range of
 * 1 to n. There are no duplicates in list. One of the integers is missing in
 * the list.
 *
 * Also use sum and subtract - integer overflow if sum is large.
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 4,6, 3, 7, 8};
        System.out.println("The missing number is: " + findMissing(input));
    }

    private static int findMissing(int[] input) {
        int missingNumber = -1;
        int xorInput = input[0];
        int xorRange = 1;
        if(input.length > 1){
            for(int i = 1; i<input.length; i++){
                xorInput ^= input[i];
                System.out.println(xorInput);
            }

            for(int i = 2; i<=input.length+1; i++){
                xorRange ^= i;
            }
            missingNumber = xorInput ^ xorRange;
        }
        return missingNumber;
    }

}
