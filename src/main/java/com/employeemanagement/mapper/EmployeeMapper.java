package com.employeemanagement.mapper;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.EmployeeResponseDto;
import com.employeemanagement.entities.BankAccount;
import com.employeemanagement.entities.Department;
import com.employeemanagement.entities.Employee;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public Employee toEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDto.employeeId());
        employee.setEmployeeName(employeeDto.employeeName());
        employee.setEmployeeAddress(employeeDto.employeeAddress());
        employee.setEmployeePhone(employeeDto.employeePhone());
        employee.setEmployeeEmail(employeeDto.employeeEmail());
        Department department = new Department();
        department.setDepartmentId(employeeDto.departmentId());
        employee.setDepartment(department);
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankAccountNumber(employeeDto.bankAccountNumber());
        bankAccount.setBankAccountType(employeeDto.bankAccountType());
        employee.setBankaccount(bankAccount);
        return employee;
    }

    public EmployeeResponseDto toEmployeeResponseDto(Employee employee) {
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto(employee.getEmployeeId(), employee.getEmployeeName(), employee.getDepartment().getDepartmentId(), employee.getBankaccount().getBankAccountNumber(), employee.getEmployeePhone());
        return employeeResponseDto;
    }

    public List<EmployeeResponseDto> employeeResponseDtos(List<Employee> employees) {
//        List<EmployeeResponseDto> employeeResponseDtos=new ArrayList<>();
//        for(Employee employee:employees)
//        {
//            employeeResponseDtos.add(toEmployeeResponseDto(employee));
//        }
//        return employeeResponseDtos;

        return employees.stream().map(this::toEmployeeResponseDto).toList();
    }
    public Employee getEmployee(EmployeeDto employeeDto)
    {
        Employee employee=new Employee();
        BankAccount bankAccount=new BankAccount();
        Department department=new Department();
        employee.setEmployeeId(employeeDto.employeeId());
        employee.setEmployeeName(employeeDto.employeeName());
        employee.setEmployeeAddress(employeeDto.employeeAddress());
        employee.setEmployeeEmail(employeeDto.employeeEmail());
        employee.setEmployeePhone(employeeDto.employeePhone());
        department.setDepartmentId(employeeDto.departmentId());
        employee.setDepartment(department);
        bankAccount.setBankAccountNumber(employeeDto.bankAccountNumber());
        bankAccount.setBankAccountType(employeeDto.bankAccountType());
        employee.setBankaccount(bankAccount);
        return employee;
    }

}
