package com.ajnarayan.kaizen.oops.CallCenter;

public class Respondent extends Manager implements Employee {


    private static boolean isAvailabe = true;
    private Respondent _instance = null;

    /**
     * Singleton pattern makes sure only 1 instance of Director is present at any time.
     * @return
     */
    private Respondent getInstance(){
        if ( _instance == null){
            _instance = new Respondent();
        }
        return _instance;
    }

    @Override
    public void dispatchCall() {
        if(isAvailabe){
            System.out.println("Assigning call to Respondent");
            isAvailabe = false;
        }else {
            System.out.println("Respondent busy, escalating");
            super.dispatchCall();
        }
    }

    @Override
    public void currentStatus() {
        super.currentStatus();
        System.out.println("Respondent is Available? " + isAvailabe);
    }


}
