package com.employeemanagement.repositories;

import com.employeemanagement.entities.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    public List<Employee> findByEmployeeNameContains(String name);
}
