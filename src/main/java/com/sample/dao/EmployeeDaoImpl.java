package com.sample.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.form.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
		
	}

	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(emp);
	}

	public void removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		Employee emp = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
		if(emp !=null ){
		sessionFactory.getCurrentSession().delete(emp);
		}
	}

	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee empUpdate = new Employee();
		empUpdate.setId(emp.getId());
		empUpdate.setFirstName(emp.getFirstName());
		empUpdate.setLastName(emp.getLastName());
		empUpdate.setEmail(emp.getEmail());
		empUpdate.setTelephone(emp.getTelephone());
		//sessionFactory.openSession().update(empUpdate);
		sessionFactory.getCurrentSession().update(empUpdate);
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		Employee emp = (Employee) sessionFactory.openSession().load(Employee.class, id);
		return emp;
	}

}
