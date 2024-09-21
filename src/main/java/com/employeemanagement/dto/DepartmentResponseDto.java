package com.employeemanagement.dto;

import java.util.Map;

public record DepartmentResponseDto(String departmentName,int departmentId, Map<Integer,String> employees)
{
}
