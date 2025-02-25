package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeePayrollService implements IEmployeePayrollService
{
    private List<EmployeePayrollData>employeePayrollDataList=new ArrayList<>();

    public  List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollDataList;
    }

<<<<<<< HEAD
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
=======
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollDataList.get(empId-1);
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(employeePayrollDataList.size()+1,employeePayrollDTO);
        employeePayrollDataList.add(empData);
        return empData;
    }

    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) {
      EmployeePayrollData empData=this.getEmployeePayrollDataById(empId);
      empData.setName(employeePayrollDTO.getName());
       empData.setSalary(employeePayrollDTO.getSalary());
       employeePayrollDataList.set(empId-1,empData);
          return empData;
    }

    public void deleteEmployeePayrollData(int empId) {
        employeePayrollDataList.remove(empId-1);
    }

}
>>>>>>> UC5
