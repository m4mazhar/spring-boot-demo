package com.dailtycodebuffer.springbootdemo.service;

import java.util.List;

import com.dailtycodebuffer.springbootdemo.model.Employee;

public interface EmployeeService {

	
	public Employee save(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(String id);

	public String deleteEmplyeeById(String id);
}
