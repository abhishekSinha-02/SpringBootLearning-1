package com.telusko.SpringBootWeb1.service.implementation;

import com.telusko.SpringBootWeb1.dto.EmployeeRequestDto;
import com.telusko.SpringBootWeb1.dto.EmployeeResponseDto;
import com.telusko.SpringBootWeb1.entity.Employee;
import com.telusko.SpringBootWeb1.repository.EmployeeRepository;
import com.telusko.SpringBootWeb1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public EmployeeResponseDto saveEmployee(EmployeeRequestDto employee) {

        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setSal(employee.getSal());

        Employee emp2 = empRepo.save(emp);

        EmployeeResponseDto responseDto = new EmployeeResponseDto();

        responseDto.setId(emp2.getId());
        responseDto.setName(emp2.getName());
        responseDto.setSal(emp2.getSal());

        return responseDto;
    }
}
