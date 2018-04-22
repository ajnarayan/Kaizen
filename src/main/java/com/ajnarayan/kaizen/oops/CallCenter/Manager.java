package com.ajnarayan.kaizen.oops.CallCenter;

public class Manager extends Director implements Employee {

    private static EmployeeStatus status = EmployeeStatus.AVAILABLE;
    private Manager _instance = null;


    private Manager getInstance(){
        if ( _instance == null){
            _instance = new Manager();
        }
        return _instance;
    }

    @Override
    public void dispatchCall() {
        if(status.equals(EmployeeStatus.AVAILABLE)){
            System.out.println("Assigning call to Manager");
            status = EmployeeStatus.ONCALL;
        }else {
            System.out.println("Manager busy, escalating");
            super.dispatchCall();
        }
    }

    @Override
    public void currentStatus() {
        super.currentStatus();
        System.out.println("Manager is currently "  + status.getValue());
    }
}
