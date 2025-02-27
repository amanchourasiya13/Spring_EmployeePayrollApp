package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @NotEmpty(message="Employee name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    private String name;

    @Min(value=500,message="Min wage should be more than 500")
    private double salary;


    public EmployeePayrollDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
@Override
  public String toString(){
        return "name="+name+":salary="+salary;
}
}