package com.employeemanagement.service;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.EmployeeResponseDto;
import com.employeemanagement.entities.Department;
import com.employeemanagement.entities.Employee;
import com.employeemanagement.mapper.EmployeeMapper;
import com.employeemanagement.repositories.EmployeeRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService
{
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }
    public EmployeeResponseDto save(EmployeeDto employeeDto)
    {
        Employee employee = employeeMapper.toEmployee(employeeDto);
        this.employeeRepository.save(employee);
        return this.employeeMapper.toEmployeeResponseDto(employee);
    }
    public List<EmployeeResponseDto> employeeResponseDtoList()
    {
        List<Employee>employees=this.employeeRepository.findAll();
        return  employees.stream().map(employeeMapper::toEmployeeResponseDto).toList();
    }
    public EmployeeResponseDto findById(int id)
    {
        Optional<Employee> employee=this.employeeRepository.findById(id);
        return employee.map(employeeMapper::toEmployeeResponseDto).orElse(null);
    }
    public List<EmployeeResponseDto> findByName(String employeeName)
    {
       return this.employeeRepository.findByEmployeeNameContains(employeeName).stream().map(employeeMapper::toEmployeeResponseDto).toList();
    }
    public void deleteById(int id)
    {
        this.employeeRepository.deleteById(id);
    }

    public EmployeeResponseDto update(EmployeeDto employeeDto)
    {
        if(isPresent(employeeDto.employeeId()))
        {
            var employee = employeeMapper.toEmployee(employeeDto);
            this.employeeRepository.save(employee);
            return this.employeeMapper.toEmployeeResponseDto(employee);
        }
        else
        {
            var employee = this.employeeRepository.save(employeeMapper.toEmployee(employeeDto));
            return this.employeeMapper.toEmployeeResponseDto(employee);
        }

    }
    private boolean isPresent(int id)
    {
        return this.employeeRepository.findById(id).isPresent();
    }

    @Transactional
    public List<EmployeeResponseDto> saveAll(List<EmployeeDto> employeeDtos)
    {
        System.out.println("service");
       List<Employee>employees= employeeDtos.stream().map(employeeMapper::getEmployee).toList();
       this.employeeRepository.saveAll(employees);
      return employees.stream().map(employeeMapper::toEmployeeResponseDto).toList();
    }
}
