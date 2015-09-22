package com.realdolmen.wolfpack.entities;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public class Employee {
    private String employeeNumber;
    private String password;
    private boolean mailFlag;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMailFlag() {
        return mailFlag;
    }

    public void setMailFlag(boolean mailFlag) {
        this.mailFlag = mailFlag;
    }
}
