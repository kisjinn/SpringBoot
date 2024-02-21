package com.application.EmployeeApplication.controller;

import com.application.EmployeeApplication.EmployeeApplication;
import com.application.EmployeeApplication.entity.Employee;
import com.application.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody

/*
ResponseBody + Controller => RestController
 */
public class EmployeeController {
    @Autowired
   //autowired get instance of employeeService from regisdty and initialised below instance with already created instance
    EmployeeService service;
     @RequestMapping("/employees")
    public List<Employee> findAllEmplyees(){

        return service.getAllEmployess();

    }

    @RequestMapping("/employees/{id}")
    //by default reuestMappimg make method consider as get request
    public Employee findFirstEmployee(@PathVariable int id){
         return service.getEmployee(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
   public void createemployee(@RequestBody Employee e){
         service.createEmployee(e);
   }

   @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
   public  void updateEmployee(@PathVariable int id, @RequestBody Employee e){
         service.updateEmployee(e);
   }

   @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public void deleteEmp(@PathVariable int id){
         service.deleteEmployee(id);
   }





}
