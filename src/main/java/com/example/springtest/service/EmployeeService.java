package com.example.springtest.service;

import com.example.springtest.entity.Employee;

import java.util.List;



public interface EmployeeService {
    Employee save(Employee employee) ;

    List<Employee> getEmployeeRecord();

    Employee getEmployeeRecordByName( String firstName);

    String deleteEmployeeRecordByName(String firstName);
}
