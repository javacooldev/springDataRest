package com.raj.department.repositories;

import org.springframework.data.repository.CrudRepository;

import com.raj.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
