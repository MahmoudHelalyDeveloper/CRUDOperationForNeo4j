package com.app.neo4j.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.neo4j.model.Employees;
import com.app.neo4j.repo.EmployeesRepo;
@Service
public class EmployeesServiceImpl  extends EmployeesService {

	@Autowired
	private EmployeesRepo employeesRepo;
	
	
	@Override
	public Employees addEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeesRepo.save(employees);

	}

	@Override
	public Employees updateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeesRepo.save(employees);
	}

	@Override
	public Employees getEmployeesByname(String name) {
		// TODO Auto-generated method stub
		
		return this.employeesRepo.findByName(name);
	}

	@Override
	public List<Employees> getEmployees() {
		// TODO Auto-generated method stub
		return this.employeesRepo.findAll();
	}

	@Override
	public void deleteEmployees(Employees employees) {
		// TODO Auto-generated method stub
		this.employeesRepo.delete(employees);
	}

	
	
	
	
	
	
}
