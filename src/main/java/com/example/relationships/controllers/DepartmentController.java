package com.example.relationships.controllers;

import com.example.relationships.models.Department;
import com.example.relationships.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public ResponseEntity<List<Department>> getAllDepartments(){
        return new ResponseEntity<>(departmentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/departments/{id}")
    public ResponseEntity getDepartment(@PathVariable Long id){
        return new ResponseEntity<>(departmentRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/departments")
    public ResponseEntity<Department> postDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }


}
