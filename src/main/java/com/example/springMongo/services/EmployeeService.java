package com.example.springMongo.services;
import com.example.springMongo.model.Employee;
import com.example.springMongo.model.EmployeeDTO;

import java.text.ParseException;
import java.util.List;

public interface EmployeeService {

    EmployeeDTO getEmployeeById(Integer employeeId);

    EmployeeDTO createEmployee(EmployeeDTO employee) throws ParseException;

    EmployeeDTO putEmployee(EmployeeDTO employee) throws ParseException;

    EmployeeDTO deleteEmployeeById(Integer employeeId);

    List<Employee> getAllEmployee();
}
