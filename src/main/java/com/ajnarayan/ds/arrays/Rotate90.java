//package com.ajnarayan.ds.arrays;
///**
// * Given an N*N array, rotates it by 90 degrees
// */
//public class Rotate90 {
//
//    private static void printArray(int[][] array){
//        for(int i=0 ; i< array.length ; i++){
//            for(int j=0; j<array[0].length; j++){
//                System.out.print(array[i][j]);
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] inputArray = new int[3][3];
//        int k = 0;
//        for(int i=0 ; i< 3 ; i++){
//            for(int j=0; j<3; j++){
//                inputArray[i][j] = k++;
//            }
//        }
//        System.out.println(" Initial Array : ");
//        printArray(inputArray);
//        System.out.println(" The rotated array is: ");
//        rotate(inputArray);
//    }
//
//    private static void rotate(int[][] inputArray) {
//        int offset = inputArray.length -1;
//        for(int i=0 ; i< inputArray.length ; i++){
//            for(int j=0; j<inputArray.length; j++){
//                int temp = inputArray[i][j];
//                inputArray[i][j] = inputArray[j][offset];
//                inputArray[j][offset] = temp;
//            }
//            offset--;
//        }
//    printArray(inputArray);
//    }
//
//
//}
