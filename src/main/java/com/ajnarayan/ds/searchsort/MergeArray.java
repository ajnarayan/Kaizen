package com.ajnarayan.ds.searchsort;

public class MergeArray extends BaseArray {

    public static void main(String[] args) {
        int[] inputA = new int[8];
        inputA[0] = 1;
        inputA[1] = 4;
        inputA[2] = 7;
        inputA[3] = 10;
        int[] inputB = new int[]{1, 3, 6, 8};
        System.out.println(" First Array with extra space: ");
        printArray(inputA);
        System.out.println(" Second Array: ");
        printArray(inputB);

        mergeArrays(inputA, inputB);
        System.out.println("In place Merged Array: ");
        printArray(inputA);
    }

    private static void mergeArrays(int[] inputA, int[] inputB) {
        int sizeA = 0;
        for(int i=0; i< inputA.length; i++){
            if(inputA[i] != 0){
                sizeA++;
            }
        }
        int sizeB = inputB.length -1;
        sizeA = sizeA - 1;
        int indexMerge = (sizeA + sizeB) + 1;

        System.out.println(sizeA);
        System.out.println(sizeB);
        System.out.println(indexMerge);

        while(sizeB >=0){
            if(sizeA >= 0 && inputA[sizeA] > inputB[sizeB]){
                inputA[indexMerge] = inputA[sizeA];
                sizeA--;
            }else{
                inputA[indexMerge] = inputB[sizeB];
                sizeB--;
            }
            indexMerge--;
        }

    }

}
