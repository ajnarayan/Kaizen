package com.ajnarayan.kaizen.bigo;

public class Memoization {

    /**
     * Prints fibonacci numbers from 0..n
     * Runtime: O(n)
     * Without memo: O(2^n)
     * @param n
     */
    private static void allFib(int n){
        int[] memo = new int[n+1];
        for(int i=0; i<n ; i++) {
            System.out.println(i +": " + fib(i, memo));
        }
    }

    private static int fib(int n, int[] memo) {
        if (n<=0) return 0;
        if (n == 1) return 1;
        if (memo[n] >0) return memo[n];

        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }

    public static void main(String args[]){
        allFib(10);
    }

}
