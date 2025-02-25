package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeePayrollController {
    @GetMapping("/test")
    public String testAPI()
    {
        return "Employee Payroll REST API is working!";
    }

    @GetMapping
    public String getEmployee(){
        return "Fetching employee";
    }

    @GetMapping("/all")
    public String getAllEmployee(){
        return "Fetching all employees";
    }

    @PostMapping()
    public String addEmployee() {
        return "Employee added!";
    }

    @PutMapping("/update")
    public String updateEmployee() {
        return "Employee updated!";
    }

    @DeleteMapping("/delete")
    public String deleteEmployee() {
        return "Employee deleted!";
    }
}