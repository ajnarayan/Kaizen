package com.ajnarayan.ds.searchsort;

import java.lang.reflect.Array;
import java.util.*;


/**
 * groups all anagram string together in an array
 * O(n logn)
 * O(1) space
 */
public class AnagramSort extends BaseArray implements Comparator<String> {

    public static void main(String[] args) {
        String input[] = {"abc", "xvy", "dog", "cab", "god"};
        Arrays.sort(input, new AnagramSort());
        printArray(input);
    }

    private static String sortString(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    @Override
    public int compare(String s1, String s2) {
        return sortString(s1).compareTo(sortString(s2));
    }
}
