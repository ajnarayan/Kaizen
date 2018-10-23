package com.ajnarayan.ds.searchsort;

import java.util.Random;
import java.util.logging.Logger;

public class QuickSort extends BaseArray{

    private static final Random RANDOM = new Random();
    private static final Logger LOG = Logger.getLogger(QuickSort.class.getSimpleName());

    public static void main(String[] args) {

        int[] input = new int[10];
        for(int i=0; i<10; i++){
            input[i] = RANDOM.nextInt(10);
        }
        LOG.info("Content of the array before : ");
        printArray(input);
        LOG.info(" Sorting ...");
        quickSort(input, 0, input.length-1);
        LOG.info(" After sorting ...");
        printArray(input);
    }

    private static void quickSort(int[] input, int left, int right) {
        //returns the pivotindex with elements to left <pivotelement and right > pivot element
        int leftIndex = partitionSort(input, left, right);
        //subpartition the arrays
        if(left < leftIndex -1){
            quickSort(input, left, leftIndex-1);
        }

        if(right > leftIndex){
            quickSort(input, leftIndex, right);
        }
    }

    private static int partitionSort(int[] input, int left, int right) {
        int pivotElement = input[(left + right) /2]; //choosing middle element as pivot

        while(left <= right){
            while(input[left] < pivotElement){
                left++;
            }
            while(input[right] > pivotElement){
                right--;
            }

            if(left <= right){
                swap(input, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] input, int left, int right) {
        int temp = input[left];
        input[left] = input[right];
        input[right] = temp;
    }
}
