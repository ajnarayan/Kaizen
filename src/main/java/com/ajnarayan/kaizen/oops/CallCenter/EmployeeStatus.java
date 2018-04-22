package com.ajnarayan.kaizen.oops.CallCenter;

public enum EmployeeStatus {

    AVAILABLE("Available"),
    ONCALL("On Call");

    private String value;

    EmployeeStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
