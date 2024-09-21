package com.employeemanagement.controller;

import com.employeemanagement.dto.DepartmentDto;
import com.employeemanagement.dto.DepartmentResponseDto;
import com.employeemanagement.entities.Department;
import com.employeemanagement.repositories.DepartmentRepository;
import com.employeemanagement.mapper.DepartmentMapper;
import com.employeemanagement.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DepartmentController
{
    public final DepartmentService departmentService;
    public DepartmentController( DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public  void addDepartment(@RequestBody Department department)
    {
         this.departmentService.save(department);
    }

    @GetMapping("/departments")
    public List<DepartmentResponseDto> getAllDepartments()
    {
        return this.departmentService.getAllDepartments();
    }
}
