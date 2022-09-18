package com.springboot.springboot.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exception.EmployeeNotFoundException;
import com.springboot.springboot.model.Employee;

@Service
public class EmployeeImpl implements EmployeeService
{
	List<Employee> employees =new ArrayList<>();
	@Override
	public Employee save(Employee employee) 
	{
		employees.add(employee);
		return employee;
	}
	@Override
	public List<Employee> getAllEmployees() 
	{		
		return employees;
	}
	@Override
	public Employee getEmployeeById(String name ) {
		return employees.stream().filter(
				employee ->employee.getName().equalsIgnoreCase(name))
				.findFirst()
				.orElseThrow(()->new EmployeeNotFoundException("Employee "+ name + " not found, try seraching with other names"));
	}
	@Override
	public String deleteEmployeeByName(String name)
	{
		Employee e=employees
				  .stream()
				  .filter(employee1 ->employee1.getName().equalsIgnoreCase(name))
				  .findFirst()
				  .get();
		employees.remove(e);
		return "Employee deleted with name:"+name;
	}

}
