package com.employeemanagement.dto;

public record EmployeeDto(int employeeId,
                          String employeeName,
                          String employeeAddress,
                          String employeePhone,
                          String employeeEmail,
                          int departmentId,
                          Long bankAccountNumber,
                          String bankAccountType
) {
}
