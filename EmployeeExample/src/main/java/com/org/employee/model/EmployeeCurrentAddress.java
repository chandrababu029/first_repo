package com.org.employee.model;

public class EmployeeCurrentAddress {
    private String houseNumber;
    private String street;
    private String city;
    private int areaPincode;

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAreaPincode() {
        return areaPincode;
    }

    public void setAreaPincode(int areaPincode) {
        areaPincode = areaPincode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }


}
