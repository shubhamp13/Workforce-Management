package com.employeemanagement.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.employeemanagement.repositories")
@EntityScan(basePackages = "com.employeemanagement.entities")
@ComponentScan(basePackages = "com.employeemanagement")

public class EmployeeManagementApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
