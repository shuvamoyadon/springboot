package com.example.springtest.service;

import com.example.springtest.entity.Employee;
import com.example.springtest.error.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> emp = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {

        if ((employee.getEmployee_Id() == null ) | (employee.getSalary().isEmpty() )){
            employee.setEmployee_Id(UUID.randomUUID().toString());
        }
        emp.add(employee);
        return employee;

    }

    @Override
    public List<Employee> getEmployeeRecord() {
        return emp;
    }

    @Override
    public Employee getEmployeeRecordByName(String firstName) {

//        return  emp.stream().filter(e-> e.getFirstName().equalsIgnoreCase(firstName)).findFirst()
//                .orElseThrow(() -> new EmployeeNotFoundException("" +
//                        "Employee not found with Id: " + firstName));

        return  emp.stream().filter(e-> e.getFirstName().equalsIgnoreCase(firstName)).findFirst()
               .orElseThrow(() -> new EmployeeNotFoundException("" +
                      "Employee not found with Id: " + firstName));
    }

    @Override
    public String deleteEmployeeRecordByName(String firstName) {
        Employee em= emp.stream().filter(e-> e.getFirstName().equalsIgnoreCase(firstName)).findFirst().get();
        System.out.println("emp"+ em.getFirstName());
        emp.remove(em);
        return "Employee Delete with this name " + firstName;
    }


}
