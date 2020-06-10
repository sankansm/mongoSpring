package com.example.springMongo.controller;

import com.example.springMongo.model.Employee;
import com.example.springMongo.model.EmployeeDTO;
import com.example.springMongo.services.Impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/employee")
    public EmployeeDTO getEmployee(@RequestParam Integer employeeId){
        return service.getEmployeeById(employeeId);
    }

    @PostMapping(value = "/employee", consumes = "application/json")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) throws ParseException {
        return service.createEmployee(employeeDTO);
    }

    @PutMapping(value = "/employee", consumes = "application/json")
    public EmployeeDTO putEmployee(@RequestBody EmployeeDTO employeeDTO) throws ParseException {
        return service.putEmployee(employeeDTO);
    }

    @DeleteMapping("/employee")
    public EmployeeDTO deleteEmployee(@RequestParam Integer employeeId){
        return service.deleteEmployeeById(employeeId);
    }

    @RequestMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }
}
