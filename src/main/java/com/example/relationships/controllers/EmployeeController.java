package com.example.relationships.controllers;

import com.example.relationships.models.Department;
import com.example.relationships.models.Employee;
import com.example.relationships.repositories.DepartmentRepository;
import com.example.relationships.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity getEmployee(@PathVariable Long id){
        return new ResponseEntity<>(employeeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/employees")
    public ResponseEntity<Employee> postDepartment(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }


}
