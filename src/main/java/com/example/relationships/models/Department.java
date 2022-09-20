package com.example.relationships.models;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public Department(){}
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
