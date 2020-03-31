package com.passorder.core;

public class Customer {
    private String name;
    private String surname;
    private String middleName;
    private String company;

    public Customer(String name, String surname, String middleName, String company) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.company = company;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
