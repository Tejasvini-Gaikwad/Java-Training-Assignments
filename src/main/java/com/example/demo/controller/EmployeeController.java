package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
     String getEmployeeController(){
        return "Hello Employee Controller";
    }

    @GetMapping("/secure/employees")
    Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        if (!employeeService.existsById(id)) {
            return null;
        }
        employee.setId(id);
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
