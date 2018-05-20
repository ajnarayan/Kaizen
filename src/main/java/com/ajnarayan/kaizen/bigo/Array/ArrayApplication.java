package com.ajnarayan.kaizen.bigo.Array;

public class ArrayApplication {


    public static void main(String[] args){
        ArrayList intArrayList = new ArrayList(2);
        System.out.println("Size of initial array : "+ intArrayList.length());
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.printList();
        System.out.println("Length: " + intArrayList.length());

    }
}
