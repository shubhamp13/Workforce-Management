package com.employeemanagement.controller;
import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.dto.EmployeeResponseDto;
import com.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController
{
    private final EmployeeService employeeService;
    public EmployeeController( EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @PostMapping("/employees")
    private EmployeeResponseDto saveEmployee(@RequestBody EmployeeDto employee)
    {
        return this.employeeService.save(employee);
    }
    @GetMapping("/employees")
    public List<EmployeeResponseDto> getAllEmployees()
    {
      return   this.employeeService.employeeResponseDtoList();
    }
    @GetMapping("/employees/id/{emp-id}")
    public EmployeeResponseDto findById(@PathVariable("emp-id") int id)
    {
       return this.employeeService.findById(id);
    }
    @GetMapping("/employees/name/{emp-name}")
    public List<EmployeeResponseDto> findByName(@PathVariable("emp-name") String name)
    {
        return this.employeeService.findByName(name);
    }
    @DeleteMapping("/employees/{emp-id}")
    public void  deleteById(@PathVariable("emp-id") int id)
    {
        this.employeeService.deleteById(id);
    }

    @PutMapping("/employees/update")
    public EmployeeResponseDto updateEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return this.employeeService.update(employeeDto);
    }
    @PostMapping("/employees-list")
    public List<EmployeeResponseDto>saveAllEmployees(@RequestBody List<EmployeeDto> employeeDtos)
    {
        System.out.println("here");
       return this.employeeService.saveAll(employeeDtos);
    }
}
