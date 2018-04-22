package com.ajnarayan.kaizen.oops.CallCenter;

public class Manager extends Director implements Employee {

    private static boolean isAvailabe = true;
    private Manager _instance = null;

    /**
     * Singleton pattern makes sure only 1 instance of Director is present at any time.
     * @return
     */
    private Manager getInstance(){
        if ( _instance == null){
            _instance = new Manager();
        }
        return _instance;
    }

    @Override
    public void dispatchCall() {
        if(isAvailabe){
            System.out.println("Assigning call to Manager");
            isAvailabe = false;
        }else {
            System.out.println("Manager busy, escalating");
            super.dispatchCall();
        }
    }

    @Override
    public void currentStatus() {
        super.currentStatus();
        System.out.println("Manager isAvailable? " + isAvailabe);
    }
}
