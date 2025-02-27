package com.bridgelabz.employeepayrollapp;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j

public class EmployeepayrollappApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication
                .run(EmployeepayrollappApplication.class,args);
       log.info("Employee Payroll App Started in {} Environment",context.getEnvironment().getProperty("environment"));

    }
}
