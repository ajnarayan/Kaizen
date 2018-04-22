package com.ajnarayan.kaizen.oops.CallCenter;

import static com.ajnarayan.kaizen.oops.CallCenter.EmployeeStatus.AVAILABLE;
import static com.ajnarayan.kaizen.oops.CallCenter.EmployeeStatus.ONCALL;

public class Director implements Employee {

    private static EmployeeStatus status = AVAILABLE;
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
        if(status.equals(AVAILABLE)){
            System.out.println("Assigning call to Director");
            status = ONCALL;
        }else{
            System.out.println("All employees are busy! Please try again later");
        }
    }

    @Override
    public void currentStatus() {
        System.out.println("Director is currently " + status.getValue());
    }
}
