package com.ajnarayan.ds.searchsort;

import java.util.Random;

import static java.util.Arrays.sort;

/**
 * O(logn)
 */
public class BinarySearch {


    public static int binarySearch(int[] input, int key){
        int size = input.length;
        int left = 0, right = size-1, mid = 0;
        while(left <= right){
            mid = (left + right)/2;
            if(input[mid] == key){
                return mid;
            }

            if(input[mid] > key){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] input = new int[10];
        for(int i=0 ; i< input.length; i++){
            input[i] = rand.nextInt(100);
        }
        int elementToSearch = input[rand.nextInt(10)];
        System.out.println(" The element to search is : " + elementToSearch);
        sort(input);
        for(int i=0 ; i< input.length; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println(" Element index : " + binarySearch(input, elementToSearch));
    }

}
