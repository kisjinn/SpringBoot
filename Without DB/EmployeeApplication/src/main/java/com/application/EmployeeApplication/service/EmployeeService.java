package com.application.EmployeeApplication.service;

import com.application.EmployeeApplication.EmployeeApplication;
import com.application.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1,"Sakshi","Wardha"),
            new Employee(2,"Snehal","Nagpur")
    ));
    public List<Employee> getAllEmployess(){
        return employeeList;
    }

    public Employee getEmployee(int id){
        return employeeList.stream().filter(e-> (e.getEmployeeId()==id)).findFirst().get();
    }

    public void createEmployee(Employee e){
        employeeList.add(e);
    }

   public void updateEmployee(Employee e){
        List<Employee> temp = new ArrayList<>();
        for(Employee emp: employeeList){
            if(e.getEmployeeId() == emp.getEmployeeId()){
                emp.setEmployeeName(e.getEmployeeName());
                emp.setCity(e.getCity());


            }

                temp.add(emp);

        }
        this.employeeList = temp;
   }

   public void deleteEmployee(int id){
       List<Employee> temp = new ArrayList<>();
       for(Employee emp: employeeList) {
           if (id == emp.getEmployeeId()) {
               continue;
           }
           temp.add(emp);
       }
       this.employeeList=temp;
   }



}

/*
@Service annotation help to register this class as service in registry
Service class is singletone so at the start of an application reloading, service instance./obj get created
Whenevr any class will call obj/instance of service class, same instance will be shared by SB
 */
