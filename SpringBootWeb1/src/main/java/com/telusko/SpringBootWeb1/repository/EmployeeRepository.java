package com.telusko.SpringBootWeb1.repository;

import com.telusko.SpringBootWeb1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

}
