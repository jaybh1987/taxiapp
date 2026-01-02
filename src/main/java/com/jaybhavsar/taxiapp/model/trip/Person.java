package com.jaybhavsar.taxiapp.model.trip;


public class Person {

      private String fname, lname, address;
      private int mobilenumber;

    private Person(String fname) {
        this.fname = fname;
    }

    private Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    private Person(String fname, String lname, String address) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    private Person(String fname, String lname, String address, int mobilenumber) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobilenumber = mobilenumber;
    }

    // Static factory methods

    public static Person getPersonWithfname(String name) {
        return new Person(name);
    }

    public static Person getPersonWithFullName(String fname, String lname) {
        return new Person(fname, lname);
    }

    public static Person getPersonWithResidencyDetails(String fname, String lname, String address) {
        return new Person(fname, lname, address);
    }

    public static Person getPersonWithAllDetails(String fname, String lname, String address, int mobilenumber) {
        return new Person(fname, lname, address, mobilenumber);
    }

}


