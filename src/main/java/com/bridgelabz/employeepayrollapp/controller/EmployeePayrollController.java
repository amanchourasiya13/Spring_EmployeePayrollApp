package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import  com.bridgelabz.employeepayrollapp.model.*;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.services.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employees")
<<<<<<< HEAD
public class EmployeePayrollController {
=======

class EmployeePayrollController {
>>>>>>> e4146ab48c38f81beadc8c9b2bfa8aa63b9e1291
    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @RequestMapping(value={"","/","/get"})
    public  ResponseEntity<ResponseDTO>getEmployeePayrollData(){
        List<EmployeePayrollData> emptDataList=null;
        emptDataList=employeePayrollService.getEmployeePayrollData();
        ResponseDTO responseDto=new ResponseDTO("Get call Successful",emptDataList);
        return new ResponseEntity<ResponseDTO>(responseDto,HttpStatus.OK);
    }

    // GET request - fetching all employees
    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployee(@PathVariable("empId")int empId) {
        EmployeePayrollData empData = null;
        empData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO responseDto = new ResponseDTO("Get call For Id Successful", empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    // POST request - Adding employee
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData=employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
        ResponseDTO responseDto = new ResponseDTO("Create Employee Payroll  Data Successfully",empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
<<<<<<< HEAD
=======

public class EmployeePayrollController {
    @GetMapping("/test")
    public String testAPI() {
        return "Employee Payroll REST API is working!";
    }

    @GetMapping
    public String getEmployye(){
        return "Fetching employee";
    }

    @GetMapping("/all")
    public String getAllEmployye(){
        return "Fetching all employees";
    }

    @PostMapping()
    public String addEmployee() {
        return "Employee added!";

>>>>>>> e4146ab48c38f81beadc8c9b2bfa8aa63b9e1291
    }

    // PUT request - updating employee data
    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId")int empId,@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
<<<<<<< HEAD
        empData =employeePayrollService.updateEmployeePayrollData(empId,employeePayrollDTO);
=======

        empData =employeePayrollService.updateEmployeePayrollData(employeePayrollDTO);

        empData =employeePayrollService.updateEmployeePayrollData(empId,employeePayrollDTO);

>>>>>>> e4146ab48c38f81beadc8c9b2bfa8aa63b9e1291
        ResponseDTO responseDto = new ResponseDTO("Updated  Employee Payroll  Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }

    // DELETE request - Removing employee
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId")int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO responseDto = new ResponseDTO("Deleted Data Successfully","Delete id :"+empId);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.OK);
    }
}
