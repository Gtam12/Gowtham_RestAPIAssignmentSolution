package com.greatlearning.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.employee.entity.Employee;
import com.greatlearning.employee.repository.EmployeeRepository;
import com.greatlearning.employee.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		List<Employee> employee = employeeRepository.findAll();
		return employee;
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteById(int id) {
	  employeeRepository.deleteById(id);
		
	}

}
