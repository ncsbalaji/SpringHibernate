package com.sample.dao;

import java.util.List;

import com.sample.form.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee emp);
	public void removeEmployee(Integer id);
	public List<Employee> listEmployees();
	public void updateEmployee(Employee emp);
	public Employee getEmployee(Integer id);

}
