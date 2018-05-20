package com.ajnarayan.kaizen.bigo.Array;


import java.util.logging.Logger;

public class ArrayList implements ArrayFacade{

    Logger logger = Logger.getLogger(ArrayList.class.getName());
    private int[] array;
    //private Class<T[]> clazz;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    ArrayList() throws AssertionError{
        this.array = new int[10];
        for(int i=0; i< 10; i++){
            this.array[i] = Integer.MAX_VALUE;
        }
        /*
        assert clazz.isArray();
        this.clazz = clazz;
        this.array = (T[]) Array.newInstance(this.clazz, 10);
        */
    }

    ArrayList(/*Class<T[]> clazz,*/ int capacity) throws AssertionError{
        assert capacity >=1;
        this.array = new int[capacity];
        for(int i=0; i< capacity; i++){
            this.array[i] = Integer.MAX_VALUE;
        }
        /*
        this.clazz = clazz;
        this.array = (T[]) Array.newInstance(this.clazz, capacity);
        */
    }

    public int length(){
        return this.array.length;
    }

    public void printList() {
        for(int i=0; i< this.array.length; i++){
            if(this.array[i] != Integer.MAX_VALUE) {
                System.out.println(this.array[i] + " ");
            }
        }
    }

    /**
     * Create an array double the capacity and copy the elements
     * @param element
     * @return
     */
    @Override
    public boolean add(int element){
        boolean isSuccess = true;
        boolean isInsert = false;
        try {
            //if(element.getClass().equals(java.lang.Integer.class)){
            int initialLength = this.array.length;
            assert initialLength >= 1;
            for(int i=0; i<initialLength; i++){
                if(this.array[i] == Integer.MAX_VALUE){
                    logger.info("Inserting element without resizing");
                    this.array[i] = element;
                    isInsert = true;
                    break;
                }
            }

            if(!isInsert) {
                logger.info("Resizing the array");
                int[] resizedArray = new int[initialLength * 2];
                int i = 0;
                while (i < initialLength) {
                    resizedArray[i] = this.array[i];
                    i++;
                }
                resizedArray[i++] = element;
                this.array = resizedArray;
                logger.info("Inserted " + element + " in to new resized array of length: " + resizedArray.length);
            }
        }catch (ArrayIndexOutOfBoundsException | AssertionError e){
            logger.warning("Exception adding element: " + e.getMessage());
            isSuccess = false;
        }
        return isSuccess;
    }
}
