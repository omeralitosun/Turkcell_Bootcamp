package org.example;

import java.util.Objects;

public class Citizen {
    private String name;
    private String surName;
    private String nationalityId;
    private int birthYear;

    public Citizen() {
    }

    public Citizen(String name, String surName, String nationalityId, int birthYear) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return birthYear == citizen.birthYear && Objects.equals(name, citizen.name) && Objects.equals(surName, citizen.surName) && Objects.equals(nationalityId, citizen.nationalityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, nationalityId, birthYear);
    }
}