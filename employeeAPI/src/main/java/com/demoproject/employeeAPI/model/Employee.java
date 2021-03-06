package com.demoproject.employeeAPI.model;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String postcode;
    private String addressLine1;
    private String addressLine2;
    private double salary;
    private String role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
