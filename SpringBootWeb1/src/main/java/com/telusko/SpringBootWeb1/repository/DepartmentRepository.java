package com.telusko.SpringBootWeb1.repository;

import com.telusko.SpringBootWeb1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {
}
