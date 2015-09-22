package com.realdolmen.wolfpack.entities;

import java.util.Random;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public class Employee extends AbstractEntity{
    final int EMPLOYEE_NUMBER_LENGTH = 5;

    private String employeeNumber;
    private String password;
    private boolean mailFlag;

    public Employee() {
        generateEmployeeNumber();
    }

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

    public void generateEmployeeNumber()
    {
        String generatedString = "Emp";
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < EMPLOYEE_NUMBER_LENGTH; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        setEmployeeNumber(output);
    }
}
