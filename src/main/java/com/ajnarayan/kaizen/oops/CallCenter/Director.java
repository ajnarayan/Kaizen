package com.ajnarayan.kaizen.oops.CallCenter;

public class Director implements Employee {

    private static boolean isAvailabe = true;
    private Director _instance = null;

    /**
     * Singleton pattern makes sure only 1 instance of Director is present at any time.
     * @return
     */
    private Director getInstance(){
        if ( _instance == null){
            _instance = new Director();
        }
        return _instance;
    }

    @Override
    public void dispatchCall() {
        if(isAvailabe){
            System.out.println("Assigning call to Director");
            isAvailabe = false;
        }
    }

    @Override
    public void currentStatus() {
        System.out.println("Director is Available? " + isAvailabe);
    }
}
