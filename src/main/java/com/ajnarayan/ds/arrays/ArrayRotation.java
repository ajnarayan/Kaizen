package com.ajnarayan.ds.arrays;

/**
 *  function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class ArrayRotation {


    //Runtime O(n), Space O(n)
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


    /*
    //Runtime O(n), space O(d)
    private static int[] rotate(int inputArray[], int d , int n){
        int[] tempArray = new int[d];
        for(int i = 0; i<d; i++){
            tempArray[i] = inputArray[i]; //O(d)
        }

        //shift remaining by d towards left
        int j = 0;
        while(j < n-d){
            int temp = inputArray[j];
            inputArray[j] = inputArray[j+d];
            inputArray[j+d] = temp;
            j++;
        }

        int k = n-d;
        j =0;
        while (k<n){
            inputArray[k] = tempArray[j];
            j++; k++;
        }
        return inputArray;
    }
    */

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
