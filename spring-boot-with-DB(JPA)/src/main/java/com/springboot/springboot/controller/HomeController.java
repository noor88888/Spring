package com.springboot.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springboot.model.Employee;
import com.springboot.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class HomeController 
{
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping
	public Employee save_employee(@RequestBody Employee employee)
	{
		return employeeservice.save(employee);	
	}
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeservice.getAllEmployees();
		
	}
	@GetMapping("/{eid}")
	public Employee getEmployeeById(@PathVariable int eid)
	{
		return employeeservice.getEmployeeById(eid);
	}
	@DeleteMapping("/{eid}")
	public void deleteEmployeeById(@PathVariable int eid)
	{
		employeeservice.deleteEmployeeById(eid);	
	}
	@PutMapping("/{eid}")
	public Employee updateEmployee(@PathVariable int eid, @RequestBody Employee employee)
	{
		return employeeservice.updateEmployee(employee,eid);
		
	}
}
