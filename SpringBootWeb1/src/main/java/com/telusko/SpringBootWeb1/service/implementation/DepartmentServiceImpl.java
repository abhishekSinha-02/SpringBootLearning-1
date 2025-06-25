package com.telusko.SpringBootWeb1.service.implementation;

import com.telusko.SpringBootWeb1.dto.DepartmentRequestDto;
import com.telusko.SpringBootWeb1.dto.DepartmentResponseDto;
import com.telusko.SpringBootWeb1.entity.Department;
import com.telusko.SpringBootWeb1.repository.DepartmentRepository;
import com.telusko.SpringBootWeb1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository deptRepo;

    @Override
    public DepartmentResponseDto saveDepartment(DepartmentRequestDto department) {

        Department dept = new Department();
        dept.setName(department.getName());
        dept.setLocation(department.getLocation());

        Department dept2 = deptRepo.save(dept);

        DepartmentResponseDto responseDto = new DepartmentResponseDto();

        responseDto.setId(dept2.getId());
        responseDto.setName(dept2.getLocation());
        responseDto.setLocation(dept2.getLocation());

        return responseDto;
    }
}
