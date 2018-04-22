package com.ajnarayan.kaizen.oops.CallCenter;

/**
 * Call center with 3 levels of employees: respondent, manager, director
 * Any incoming telephone call should be allocated to respondent who is free
 * If respondent is not free, escalate to manager
 * If manager not free, escalate to director
 */
public class CallCenterApplication {

    public static void main(String[] args){
        Employee employee = new Respondent();
        System.out.println("Calling Respondent for the call1");
        employee.dispatchCall();
        System.out.println("Call Done, status is: ");
        employee.currentStatus();

        System.out.println();

        System.out.println("Calling Respondent for the call2");
        employee.dispatchCall();
        System.out.println("Call Done, status is: ");
        employee.currentStatus();

        System.out.println();

        System.out.println("Calling Respondent for the call3");
        employee.dispatchCall();
        System.out.println("Call Done, status is: ");
        employee.currentStatus();



        System.out.println();

        System.out.println("Calling Respondent for the call4");
        employee.dispatchCall();
        System.out.println("Call Done, status is: ");
        employee.currentStatus();
    }

}
