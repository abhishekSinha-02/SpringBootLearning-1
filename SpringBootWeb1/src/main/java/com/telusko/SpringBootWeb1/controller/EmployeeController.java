package com.telusko.SpringBootWeb1.controller;

import com.telusko.SpringBootWeb1.dto.EmployeeRequestDto;
import com.telusko.SpringBootWeb1.dto.EmployeeResponseDto;
import com.telusko.SpringBootWeb1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public EmployeeResponseDto saveEmployee(@RequestBody EmployeeRequestDto employee){
        return employeeService.saveEmployee(employee);
    }
}
