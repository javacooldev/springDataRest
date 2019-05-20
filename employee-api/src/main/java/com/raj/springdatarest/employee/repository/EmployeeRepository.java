package com.raj.springdatarest.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.raj.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
