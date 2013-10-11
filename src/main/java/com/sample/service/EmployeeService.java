package com.sample.service;

import java.util.List;

import com.sample.form.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public void removeEmployee(Integer id);
	public List<Employee> listEmployees();
	public void updateEmployee(Employee emp);
	public Employee getEmployee(Integer id);

}
