package com.application.EmployeeApplication.controller;

import com.application.EmployeeApplication.EmployeeApplication;
import com.application.EmployeeApplication.entity.Employee;
import com.application.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody

/*
ResponseBody + Controller => REstController
 */
public class EmployeeController {
    @Autowired
   //autowired get instance of employeeService from regisdty and initialised below instance with already created instance
    EmployeeService service;
     @RequestMapping("/employees")
    public List<Employee> findAllEmplyees(){

        return service.getAllEmployess();

    }

}
