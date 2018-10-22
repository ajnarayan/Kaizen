package com.ajnarayan.ds.searchsort;

import java.util.Random;
import java.util.logging.Logger;

public class MergeSort {

    private static final Random RANDOM = new Random();
    private static final Logger LOG = Logger.getLogger("MergeSort");

    public static void main(String[] args) {

        int[] input = new int[10];
        for(int i=0; i<10; i++){
            input[i] = RANDOM.nextInt(10);
        }
        int[] dest = new int[input.length];
        LOG.info("Content of the array before : ");
        printArray(input);
        LOG.info(" Sorting ...");
        mergeSort(input, dest, 0, input.length-1);
        LOG.info(" After sorting ...");
        printArray(dest);
    }

    private static void mergeSort(int[] source, int[] dest, int left, int right) {
        while(left < right){
            int mid = (left + right) /2;
            mergeSort(source, dest, left , mid);
            mergeSort(source, dest, mid+1 , right);
            merge(source, dest, left, mid, right);
        }
    }


    private static void merge(int[] input, int[] helperArray, int left, int mid, int right) {
        for(int i=left ; i<=right; i++){
            helperArray[i] = input[i];
        }

        int helperLeft = left;
        int helperRight = mid + 1;
        int curr = left;

        while(helperLeft <= mid && helperRight <= right){
            if(input[helperLeft] <= input[helperRight]){
                input[curr] = helperArray[helperLeft];
                helperLeft++;
            }else{
                input[curr] = helperArray[helperRight];
                helperRight++;
            }
            curr++;
        }

        int rem = mid - helperLeft;
        for(int i =0 ; i<=rem ; i++){
            input[curr+i] = helperArray[helperLeft+i];
        }
    }


    private static void printArray(int[] input) {
        for(int i =0 ; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println(" ");
    }
}
