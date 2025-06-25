package com.telusko.SpringBootWeb1.service;

import com.telusko.SpringBootWeb1.dto.EmployeeRequestDto;
import com.telusko.SpringBootWeb1.dto.EmployeeResponseDto;

public interface EmployeeService {

    public EmployeeResponseDto saveEmployee(EmployeeRequestDto employee);
}
