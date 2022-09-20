package com.example.relationships.models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void setProject(List<Employee> project) {
        this.project = project;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public List<Employee> getProject() {
        return project;
    }

    private String name;
    private int durationDays;
    private List<Employee> project;

    public Project(String name, int durationDays) {
        this.name = name;
        this.durationDays = durationDays;
        this.project = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        project.add(employee);

    }
}
