package com.sp.employeeservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.employeeservice.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByNameLike(String name);

}
