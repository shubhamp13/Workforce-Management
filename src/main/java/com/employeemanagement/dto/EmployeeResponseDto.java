package com.employeemanagement.dto;

public record EmployeeResponseDto(
        int emp_id,
        String emp_name,
        int departmentId,
        Long bank_account_number,
        String emp_phone
) {
}
