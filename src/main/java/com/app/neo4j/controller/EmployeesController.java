package com.app.neo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.neo4j.model.Employees;
import com.app.neo4j.service.EmployeesService;

@RestController
public class EmployeesController {

	@Autowired
	private  EmployeesService employeesService;
	
	@PostMapping("addNewEmployees")
	public ResponseEntity<Employees> addEmployees( @RequestBody Employees employees){
		
		  Employees addEmployees = this.employeesService.addEmployee (employees);
		  
		  return new ResponseEntity<Employees>(employees,HttpStatus.OK);
		
	}
	
	@PostMapping("updateEmployees")
	public ResponseEntity<Employees> updateEmployees( @RequestBody Employees employees){
		
		  Employees updateEmployees = this.employeesService.updateEmployee(employees);
		  
		  return new ResponseEntity<Employees>(updateEmployees,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getEmployeesByName")
	public ResponseEntity<List< Employees>> getEmployeesByName( @RequestParam(name = "name") String name){
		
		  Employees getEmployee = this.employeesService.getEmployeesByname(name);
		  
		  return new ResponseEntity(getEmployee,HttpStatus.OK);
		
	}
	
	@GetMapping("/getEmployees")
	public ResponseEntity<List< Employees>> getEmployees( ){
		
		  List< Employees> allEmployees = this.employeesService.getEmployees();
		  
		  return new ResponseEntity(allEmployees,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteEmployees")
	public void deleteEmployees( @RequestParam(name = "name") String name){
		
		  Employees employeesByname = this.employeesService.getEmployeesByname(name);
		  
		  this.employeesService.deleteEmployees(employeesByname);
		  
		
	}
	
	
	
	
	
	
	
}
