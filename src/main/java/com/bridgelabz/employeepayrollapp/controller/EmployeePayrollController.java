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

class EmployeePayrollController {
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
    }

    // PUT request - updating employee data
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData =employeePayrollService.updateEmployeePayrollData(employeePayrollDTO);
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