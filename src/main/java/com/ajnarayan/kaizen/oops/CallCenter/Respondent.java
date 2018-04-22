package com.ajnarayan.kaizen.oops.CallCenter;

public class Respondent extends Manager implements Employee {


    private static EmployeeStatus status = EmployeeStatus.AVAILABLE;
    private Respondent _instance = null;

    private Respondent getInstance(){
        if ( _instance == null){
            _instance = new Respondent();
        }
        return _instance;
    }

    @Override
    public void dispatchCall() {
        if(status.equals(EmployeeStatus.AVAILABLE)){
            System.out.println("Assigning call to Respondent");
            status = EmployeeStatus.ONCALL;
        }else {
            System.out.println("Respondent busy, escalating");
            super.dispatchCall();
        }
    }

    @Override
    public void currentStatus() {
        super.currentStatus();
        System.out.println("Respondent is currently " + status.getValue());
    }


}
