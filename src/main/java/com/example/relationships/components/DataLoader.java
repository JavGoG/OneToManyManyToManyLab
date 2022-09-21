package com.example.relationships.components;

import com.example.relationships.models.Department;
import com.example.relationships.models.Employee;
import com.example.relationships.models.Project;
import com.example.relationships.repositories.DepartmentRepository;
import com.example.relationships.repositories.EmployeeRepository;
import com.example.relationships.repositories.ProjectRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    public DataLoader(){}
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ProjectRepostiory projectRepostiory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Department it = new Department("I.T.");
        departmentRepository.save(it);
        Department physics = new Department("physics");
        departmentRepository.save(physics);
        Department latin = new Department("latin");
        departmentRepository.save(latin);
        Department maths = new Department("maths");
        departmentRepository.save(maths);

        Employee javier = new Employee("Javier", "Gonzalez Garcia", 1, new Project("Foundation", 20));
        employeeRepository.save(javier);
        Employee paquito = new Employee("Paco", "Perez Lopez", 1, new Project("Foundation", 20));
        employeeRepository.save(paquito);

        Project foundation = new Project("foundation", 20);
        projectRepostiory.save(foundation);
        Project degree = new Project("degree", 30);
        projectRepostiory.save(degree);

        foundation.addEmployee(paquito);
        degree.addEmployee(javier);
        foundation.addEmployee(javier);
        degree.addEmployee(paquito);

        it.addEmployee(javier);
        it.addEmployee(paquito);
        physics.addEmployee(paquito);
        physics.addEmployee(javier);
        latin.addEmployee(javier);
        latin.addEmployee(paquito);
        maths.addEmployee(javier);
        maths.addEmployee(paquito);
    }
}
