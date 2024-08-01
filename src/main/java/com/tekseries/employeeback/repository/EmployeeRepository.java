package com.tekseries.employeeback.repository;

import com.tekseries.employeeback.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
