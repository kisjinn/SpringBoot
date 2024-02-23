package com.application.EmployeeApplication.service;

import com.application.EmployeeApplication.EmployeeApplication;
import com.application.EmployeeApplication.Repository.EmployeeRepository;
import com.application.EmployeeApplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1,"Sakshi","Wardha"),
            new Employee(2,"Snehal","Nagpur")
    ));
    public List<Employee> getAllEmployess(){

        return employeeRepository.findAll(); //returns list of all employee
    }
    @Autowired
    EmployeeRepository employeeRepository;
    public Optional<Employee> getEmployee(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()) {
            throw new RuntimeException("Not Found");
        }
        return Optional.of(optional.get());
    }


    public void createEmployee(Employee e){
       // employeeList.add(e);
        employeeRepository.save(e);
    }

   public void updateEmployee(Employee e){
//        List<Employee> temp = new ArrayList<>();
//        for(Employee emp: employeeList){
//            if(e.getEmployeeId() == emp.getEmployeeId()){
//                emp.setEmployeeName(e.getEmployeeName());
//                emp.setCity(e.getCity());
//
//
//            }
//                temp.add(emp);

//
//        }
//        this.employeeList = temp;
       employeeRepository.save(e);
   }

   public void deleteEmployee(int id){
//       List<Employee> temp = new ArrayList<>();
//       for(Employee emp: employeeList) {
//           if (id == emp.getEmployeeId()) {
//               continue;
//           }
//           temp.add(emp);
//       }
//       this.employeeList=temp;
       employeeRepository.delete(employeeRepository.getById(id));
   }



}

/*
@Service annotation help to register this class as service in registry
Service class is singletone so at the start of an application reloading, service instance./obj get created
Whenevr any class will call obj/instance of service class, same instance will be shared by SB
 */
