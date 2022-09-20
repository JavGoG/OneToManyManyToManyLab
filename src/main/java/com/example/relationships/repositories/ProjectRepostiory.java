package com.example.relationships.repositories;

import com.example.relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepostiory extends JpaRepository<Project, Long> {
}
