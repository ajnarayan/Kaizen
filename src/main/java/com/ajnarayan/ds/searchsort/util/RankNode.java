package com.ajnarayan.ds.searchsort.util;

public class RankNode {

    private int leftChild;
    private RankNode left, right;
    private int value;

    public RankNode(int data) {
        this.value = data;
        left = null;
        right = null;
    }

    public void insert(int data) {
        if (data <= value) {
            if (left == null) {
                left = new RankNode(data);
            } else {
                left.insert(data);
            }
            leftChild++;
        } else {
            if (right == null) {
                right = new RankNode(data);
            } else {
                right.insert(data);
            }
        }
    }


    public int getRank(int data) {
        if (value == data) {
            return leftChild + 1;
        } else {
            if (value < data) {
                if (left != null)
                    return left.getRank(data);
                else
                    return -1;
            } else {
                int rightRank = (right == null) ? -1 : right.getRank(data);
                if (rightRank != -1)
                    return leftChild + rightRank + 1;
                else
                    return -1;
            }
        }
    }
}
