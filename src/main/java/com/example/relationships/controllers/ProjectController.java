package com.example.relationships.controllers;

import com.example.relationships.models.Project;
import com.example.relationships.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public ResponseEntity<List<Project>> getAllProjects(){
        return new ResponseEntity<>(projectRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/projects/{id}")
    public ResponseEntity getProject(@PathVariable Long id){
        return new ResponseEntity<>(projectRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/projects")
    public ResponseEntity<Project> postProject(@RequestBody Project project){
        projectRepository.save(project);
        return new ResponseEntity<>(project, HttpStatus.CREATED);
    }


}
