package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import  com.bridgelabz.employeepayrollapp.model.*;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employees")
class EmployeePayrollController {
    @RequestMapping(value={"","/","/get"})
   public  ResponseEntity<ResponseDTO>getEmployeePayrollData(){
        EmployeePayrollData emptData=null;
        emptData=new EmployeePayrollData(1,new EmployeePayrollDTO("Aman",30000));
        ResponseDTO responseDto=new ResponseDTO("Get call Successful",emptData);
        return new ResponseEntity<ResponseDTO>(responseDto,HttpStatus.OK);
    }

    @GetMapping("/test")
    public String testAPI() {
        return "Employee Payroll REST API is working!";
    }

    // GET request - fetching all employees
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployee(@PathVariable("empId")int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000));
        ResponseDTO responseDto = new ResponseDTO("Get call For Id Successful", empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }
    // POST request - Adding employee
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO responseDto = new ResponseDTO("Create Employee Payroll  Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    // PUT request - updating employee data
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO responseDto = new ResponseDTO("Updated  Employee Payroll  Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    // DELETE request - Removing employee
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId")int empId) {
        ResponseDTO responseDto = new ResponseDTO("Deleted Data Successfully","Delete id :"+empId);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }
}