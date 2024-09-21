package com.employeemanagement.mapper;

import com.employeemanagement.dto.DepartmentDto;
import com.employeemanagement.dto.DepartmentResponseDto;
import com.employeemanagement.entities.Department;
import com.employeemanagement.entities.Employee;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentMapper
{
    public Department toDepartment(DepartmentDto departmentDto)
    {
        Department department = new Department();
        department.setDepartmentId(departmentDto.departmentId());
        department.setDepartmentName(departmentDto.departmentName());
        return department;
    }

    public DepartmentResponseDto departmentResponseDto(Department department)
    {
        Set<Employee> employees = department.getEmployees();
        Map<Integer,String> emp=employees.stream().collect(Collectors.toMap(Employee::getEmployeeId,Employee::getEmployeeName));
        DepartmentResponseDto departmentResponseDto=new DepartmentResponseDto(department.getDepartmentName(),department.getDepartmentId(), emp);
        return departmentResponseDto;
//        for(Employee employee:employees)
//        {
//            emp.put(employee.getEmp_id(),employee.getEmployeeName());
//        }
    }
    public List<DepartmentResponseDto> departmentResponseDtoList(List<Department> departmentList)
    {
        return departmentList.stream().map(this::departmentResponseDto).toList();
    }
}
