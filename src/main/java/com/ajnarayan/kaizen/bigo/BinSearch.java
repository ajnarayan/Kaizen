package com.ajnarayan.kaizen.bigo;

import java.util.Random;


/**
 * logn
 * Given sorted array, search for an element
 * [a1, a2, a3, a4, a5, a6]
 * start       mid      end
 */
public class BinSearch {

    public static boolean binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) /2 ;
            if (array[mid] == target) {
                return true;
            }
            if (target > array[mid]) {
                start = mid +1;
            } else {
                end = mid - 1 ;
            }
        }
        return false;
    }

    private static int binaryRec(int[] array, int target, int start, int end){
        int mid = (start + end)/2;

        if(start>end){
            return -1;
        }

        if(array[mid] == target){
            return mid;
        }

        if(array[mid] > target)
            return binaryRec(array, target, start, mid -1);

        return binaryRec(array, target, mid +1 , end);
    }

    public static void main(String[] args){
        int[] inputArray = new int[10];
        for(int i = 0; i<10; i++){
            inputArray[i] = i;
        }
        for(int i : inputArray){
            System.out.print(i + " ");
        }
        System.out.println();
        Random r = new Random();
        int target = r.nextInt(15) +1;
        System.out.println("Target is : " + target);
        System.out.println("element found : " + binarySearch(inputArray, target));
        System.out.println("Element index is : "+ binaryRec(inputArray, target
                , 0, inputArray.length -1));
    }

}
