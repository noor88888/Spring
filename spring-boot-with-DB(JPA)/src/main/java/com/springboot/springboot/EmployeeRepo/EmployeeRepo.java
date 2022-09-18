package com.springboot.springboot.EmployeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springboot.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
