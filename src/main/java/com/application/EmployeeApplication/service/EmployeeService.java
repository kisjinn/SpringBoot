package com.application.EmployeeApplication.service;

import com.application.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1,"Sakshi","Wardha"),
            new Employee(2,"Snehal","Nagpur")
    );
    public List<Employee> getAllEmployess(){
        return employeeList;
    }

}

/*
@Service annotation help to register this class as service in registry
Service class is singletone so at the start of an application reloading, service instance./obj get created
Whenevr any class will call obj/instance of service class, same instance will be shared by SB
 */
