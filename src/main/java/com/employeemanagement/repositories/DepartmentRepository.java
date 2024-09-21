package com.employeemanagement.repositories;

import com.employeemanagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
}
