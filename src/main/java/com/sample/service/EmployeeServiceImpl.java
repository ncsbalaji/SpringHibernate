package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.EmployeeDao;
import com.sample.form.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
		
	}
	@Transactional
	public void removeEmployee(Integer id) {
		employeeDao.removeEmployee(id);
	}
	@Transactional
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployees();
	}
	
	@Transactional
	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(emp);
	}
	
	@Transactional
	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(id);
	}
	
	

}
