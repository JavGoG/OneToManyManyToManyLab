package com.example.relationships.models;

import java.util.List;

public class Department {
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(List<Employee> department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getDepartment() {
        return department;
    }

    private String name;
    private List<Employee> department;

    public Department(String name, List<Employee> department) {
        this.name = name;
        this.department = department;
    }
    public Department(){}
    public void addEmployee(Employee employee){
        department.add(employee);
    }
}
