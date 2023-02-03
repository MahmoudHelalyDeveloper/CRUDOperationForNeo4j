package com.app.neo4j.service;

import java.util.List;

import com.app.neo4j.model.Employees;

public abstract class EmployeesService {

	public  abstract Employees addEmployee(Employees employees);
	
	
	public  abstract Employees updateEmployee(Employees employees);
	
	
	public abstract Employees getEmployeesByname(String name);
	
	
	public abstract List<Employees> getEmployees();
	
	public abstract void deleteEmployees(Employees employees);
	
}
