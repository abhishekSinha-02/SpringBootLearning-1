package com.telusko.SpringBootWeb1.controller;

import com.telusko.SpringBootWeb1.dto.DepartmentRequestDto;
import com.telusko.SpringBootWeb1.dto.DepartmentResponseDto;
import com.telusko.SpringBootWeb1.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("/departments")
    public DepartmentResponseDto saveDepartment(@RequestBody DepartmentRequestDto department){
        return departmentService.saveDepartment(department);
    }
}
