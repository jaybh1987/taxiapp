package com.jaybhavsar.taxiapp.model;

public class Car {

    private String ownerName;
    private String companyName;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Car(){}

    public Car(String ownerName, String companyName){
        this.ownerName = ownerName;
        this.companyName = companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCompanyName() {
        return companyName;
    }

}
