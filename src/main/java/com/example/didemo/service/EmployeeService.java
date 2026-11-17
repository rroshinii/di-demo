
package com.example.didemo.service;

import com.example.didemo.model.Employee;
import com.example.didemo.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    // Constructor Injection
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}

