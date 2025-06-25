package com.telusko.SpringBootWeb1.service;

import com.telusko.SpringBootWeb1.dto.DepartmentRequestDto;
import com.telusko.SpringBootWeb1.dto.DepartmentResponseDto;

public interface DepartmentService {

    public DepartmentResponseDto saveDepartment(DepartmentRequestDto department);
}
