package org.example;

public class Customer {
    private String name;
    private String surName;
    private String nationalityId;
    private int birthYear;

    public Customer() {
    }

    public Customer(String name, String surName, String nationalityId, int birthYear) {
        this.name = name;
        this.surName = surName;
        this.nationalityId = nationalityId;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
