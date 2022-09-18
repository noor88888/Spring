package com.springboot.springboot.service;

import java.util.List;

import com.springboot.springboot.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int eid);

	void deleteEmployeeById(int eid);

	Employee updateEmployee(Employee employee, int eid);
}
