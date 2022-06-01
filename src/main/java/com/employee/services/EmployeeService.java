package com.employee.services;

import com.employee.models.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    EmployeeModel createEmployee(EmployeeModel employee);

    List<EmployeeModel> getAllEmployees();

    boolean deleteEmployee(Long id);

    EmployeeModel getEmployeeById(Long id);

    EmployeeModel updateEmployee(Long id, EmployeeModel employee);
}