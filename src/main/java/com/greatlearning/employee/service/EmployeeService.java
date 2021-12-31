package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);

}
