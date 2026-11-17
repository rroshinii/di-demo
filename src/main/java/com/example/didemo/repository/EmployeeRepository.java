
package com.example.didemo.repository;

import com.example.didemo.model.Employee;
import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    void save(Employee employee);
}

