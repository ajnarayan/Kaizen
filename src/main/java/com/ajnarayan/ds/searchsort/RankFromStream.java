package com.ajnarayan.ds.searchsort;

import com.ajnarayan.ds.searchsort.util.BaseArray;
import com.ajnarayan.ds.searchsort.util.RankNode;

import java.util.Random;

public class RankFromStream extends BaseArray {

    private static final Random RANDOM = new Random();
    private static RankNode rankNode;

    public static void main(String[] args) {

        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            input[i] = getRandomElement();
        }

        System.out.println("Array : ");
        printArray(input);

        for (int i = 0; i < 10; i++) {
            track(i);
        }

        int randomIndex = getRandomElement();
        System.out.println("Rank of " + input[randomIndex] + " : "
                + rankNode.getRank(input[randomIndex]));

        randomIndex = getRandomElement();
        System.out.println("Rank of " + input[randomIndex] + " : "
                + rankNode.getRank(input[randomIndex]));
    }

    private static int getRandomElement() {
        return RANDOM.nextInt(10);
    }

    private static void track(int i) {
        if (rankNode == null) {
            rankNode = new RankNode(i);
        } else {
            rankNode.insert(i);
        }
    }


}
