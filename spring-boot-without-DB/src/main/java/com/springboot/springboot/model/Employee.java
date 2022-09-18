package com.springboot.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"department"}) //if we dont want the property to be displayed we can use this annotation
public class Employee
{
	
	
	int eid;
	String name;
	String department;
	String location;
	
	public Employee(int eid, String name, String department, String location) {
		super();
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.location = location;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
