package com.example.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domain.Employee;

@RepositoryRestResource(collectionResourceRel="employee" , path="employee")
public interface EmployeeRepository extends GraphRepository<Employee> {
	
}
