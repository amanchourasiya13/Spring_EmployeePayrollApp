package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData>empDataList=new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Aman",30000)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(1,new EmployeePayrollDTO("Aman",30000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(1,employeePayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData=null;
        empData =new EmployeePayrollData(1,employeePayrollDTO);
        return  empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        
    }
}