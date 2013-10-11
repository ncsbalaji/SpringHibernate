package com.sample.test;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sample.form.Employee;

public class EmpDbTest {
	HibernateTemplate template;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.template = new HibernateTemplate(sessionFactory);
	}
	public void saveEmployee(Employee emp){
		template.save(emp);
	}

}
