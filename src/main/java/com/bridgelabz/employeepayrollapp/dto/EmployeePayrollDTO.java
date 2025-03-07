package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data // ✅ Lombok will auto-generate getters, setters, toString, equals, and hashCode
public class EmployeePayrollDTO {
    @NotEmpty(message = "Employee name cannot be empty")

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name must start with an uppercase letter and be at least 3 characters long")
    private String name;

    @Min(value = 500, message = "Minimum wage should be more than 500")
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
