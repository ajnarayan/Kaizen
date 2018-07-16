package com.ajnarayan.ds.arrays;

/**
 *  function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class ArrayRotation {

    private static int[] rotate(int inputArray[], int d, int n){

        if(n<=0){
            System.out.println(" Array size too small " + n);
        }

        int[] tempArray = new int[n];
        for(int i = 0; i<n; i++){
            int j = ((n-d) + i)%n;
            tempArray[j] = inputArray[i];
        }

        return tempArray;
    }

    private static void printArray(int inputArray[]){
        for(int i =0; i<inputArray.length; i++){
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Initial Array is : ");
        printArray(inputArray);
        inputArray = rotate(inputArray, 2, inputArray.length);
        System.out.println("Rotated elements by 2, the Array is : ");
        printArray(inputArray);
    }
}
