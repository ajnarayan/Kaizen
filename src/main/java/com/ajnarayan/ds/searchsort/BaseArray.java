package com.ajnarayan.ds.searchsort;

public abstract class BaseArray {

    protected static void printArray(int[] input) {
        for(int i =0 ; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println(" ");
    }

    protected static void printArray(String[] input) {
        for(String s : input){
            System.out.print(s + " ");
        }
        System.out.println(" ");
    }
}
