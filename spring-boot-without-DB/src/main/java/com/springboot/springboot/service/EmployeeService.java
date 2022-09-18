package com.springboot.springboot.service;

import java.util.List;

import com.springboot.springboot.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(String name);

	String deleteEmployeeByName(String name);

	

}
