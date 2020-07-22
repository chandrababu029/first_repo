package com.org.employee.model;

public class EmployeeAddress {
    private EmployeeCurrentAddress currentAddress;
    private EmployeePermanentAddress permanentAddress;

    public EmployeeCurrentAddress getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(EmployeeCurrentAddress currentAddress) {
        this.currentAddress = currentAddress;
    }

    public EmployeePermanentAddress getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(EmployeePermanentAddress permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
