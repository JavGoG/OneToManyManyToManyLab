package com.example.relationships.models;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private int employeeNumber;

    public Employee(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Project getProject() {
        return project;
    }

    public Employee(String firstName, String lastName, int employeeNumber, Project project) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.project = project;
    }

    private Project project;
}
