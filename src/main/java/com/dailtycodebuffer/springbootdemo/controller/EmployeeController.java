package com.dailtycodebuffer.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailtycodebuffer.springbootdemo.model.Employee;
import com.dailtycodebuffer.springbootdemo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployeeById(id);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployees() {
		
		return employeeService.getAllEmployees();	
	}

	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
	
		return employeeService.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable String id) {
		return employeeService.deleteEmplyeeById(id);
	}
}
