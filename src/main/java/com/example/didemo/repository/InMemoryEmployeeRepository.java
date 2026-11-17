
package com.example.didemo.repository;

import com.example.didemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository
        implements EmployeeRepository {

    private final List<Employee> employees = new ArrayList<>();

    public InMemoryEmployeeRepository() {
        employees.add(
                new Employee(1, "Roshini", "Development")
        );

        employees.add(
                new Employee(2, "Alex", "Testing")
        );
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }
}

