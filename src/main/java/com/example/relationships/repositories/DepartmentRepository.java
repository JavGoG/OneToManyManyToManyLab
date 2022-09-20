package com.example.relationships.repositories;

import com.example.relationships.models.Department;
import com.example.relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
