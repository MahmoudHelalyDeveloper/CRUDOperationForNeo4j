package com.app.neo4j.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.app.neo4j.model.Employees;

public interface EmployeesRepo  extends Neo4jRepository<Employees, Integer> {
	
	
	public Employees findByName(String name);

}
