package com.ajnarayan.ds.arrays;

public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        swap(a,b);
    }

    /**
     * XOR Swap
     * @param a
     * @param b
     */
    private static void swap(int a, int b) {
        System.out.println("Before Swapping : a=" + a + " , b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping : a=" + a + " , b=" + b);
    }
}
