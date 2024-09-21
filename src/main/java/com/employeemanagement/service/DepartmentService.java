package com.employeemanagement.service;

import com.employeemanagement.dto.DepartmentDto;
import com.employeemanagement.dto.DepartmentResponseDto;
import com.employeemanagement.entities.Department;
import com.employeemanagement.mapper.DepartmentMapper;
import com.employeemanagement.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;
    public DepartmentService(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper)
    {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }
    public DepartmentResponseDto addDepartment(DepartmentDto departmentDto)
    {
        Department department=departmentMapper.toDepartment(departmentDto);
        this.departmentRepository.save(department);
        return this.departmentMapper.departmentResponseDto(department);
    }
    public List<DepartmentResponseDto> getAllDepartments()
    {

//        List<Department> departments=this.departmentRepository.findAll();
//        List<DepartmentResponseDto> departmentResponseDtos=new ArrayList<DepartmentResponseDto>();
//        for(Department department:departments)
//        {
//            departmentResponseDtos.add(this.departmentMapper.departmentResponseDto(department));
//        }
//        return departmentResponseDtos;
        return departmentRepository.findAll().stream().map(departmentMapper::departmentResponseDto).toList();
    }
    public Department save(Department department)
    {
        return this.departmentRepository.save(department);
    }
}
