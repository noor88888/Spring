package com.springboot.springboot.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.springboot.EmployeeRepo.EmployeeRepo;
import com.springboot.springboot.exception.EmployeeNotFoundException;
import com.springboot.springboot.model.Employee;

@Service
public class EmployeeImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepo er;
	@Override
	public Employee save(Employee employee) 
	{
		return er.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() 
	{
		return er.findAll();
	}
	@Override
	public Employee getEmployeeById(int eid) 
	{
		return er.findById(eid).orElseThrow(()->new EmployeeNotFoundException("Employee with id:"+ eid + " not found try seraching with other id"));
	}
	@Override
	public void deleteEmployeeById(int eid)
	{	
		er.findById(eid).orElseThrow(()->new EmployeeNotFoundException("Employee with id:"+ eid + " not found ,enter correct id to delete"));
		er.deleteById(eid);
	}
	@Override
	public Employee updateEmployee(Employee employee ,int eid)
	{
		Employee existingEmp=er.findById(eid).orElseThrow(()->new EmployeeNotFoundException("Employee with id:"+ eid + " not found ,enter correct id to update"));
		existingEmp.setName(employee.getName());
		existingEmp.setDepartment(employee.getDepartment());
		existingEmp.setLocation(employee.getLocation());
		er.save(existingEmp);
		return existingEmp;
	}
}
