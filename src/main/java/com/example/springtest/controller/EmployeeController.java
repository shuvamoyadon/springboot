package com.example.springtest.controller;

import com.example.springtest.entity.Employee;
import com.example.springtest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private  EmployeeService empserv;

    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return empserv.save(emp);
    }

    @GetMapping
    public List<Employee> getRecord() {
        return empserv.getEmployeeRecord();
    }

    @GetMapping("/{firstName}")
    public Employee getRecordByName(@PathVariable String firstName) {
        return empserv.getEmployeeRecordByName(firstName);
    }

    @DeleteMapping("/{firstName}")
    public String deleteRecordByName(@PathVariable String firstName) {
        return empserv.deleteEmployeeRecordByName(firstName);
    }


}
