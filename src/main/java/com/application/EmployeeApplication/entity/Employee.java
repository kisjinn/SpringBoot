package com.application.EmployeeApplication.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;


public class Employee {
    private int employeeId;

    private String  employeeName;
    private String city;
    public Employee(int employeeId, String employeeName, String city){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.city=city;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
