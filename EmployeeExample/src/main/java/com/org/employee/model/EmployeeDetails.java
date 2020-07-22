package com.org.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeDetails {
    private String eName;
    @Id
    private int eId;
    private String eSalary;
    private EmployeeAddress eAddress;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteSalary() {
        return eSalary;
    }

    public void seteSalary(String eSalary) {
        this.eSalary = eSalary;
    }

    public EmployeeAddress geteAddress() {
        return eAddress;
    }

    public void seteAddress(EmployeeAddress eAddress) {
        this.eAddress = eAddress;
    }
}
