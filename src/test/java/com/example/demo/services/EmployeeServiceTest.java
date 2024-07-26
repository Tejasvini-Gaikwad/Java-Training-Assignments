package com.example.demo.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Employee;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setId(10);
        employee.setFname("John");
        employee.setLname("Doe");
        employee.setRollNo("1234");

        Employee savedEmployee = employeeService.saveEmployee(employee);
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    @Test
    public void testGetAllEmployees() {
        Iterable<Employee> employees = employeeService.getEmployees();
        assertThat(employees).isNotEmpty();
    }
}
