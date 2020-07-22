package com.org.employee.model;

public class EmployeePermanentAddress {
    private String houseNumber;
    private String street;
    private String city;
    private int areaPincode;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAreaPincode() {
        return areaPincode;
    }

    public void setAreaPincode(int areaPincode) {
        this.areaPincode = areaPincode;
    }
}
