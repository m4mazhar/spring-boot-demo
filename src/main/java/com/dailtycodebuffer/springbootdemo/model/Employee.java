package com.dailtycodebuffer.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String departmentId;
}
