package com.sample.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sample.form.Employee;
public class DBTest extends HibernateDaoSupport {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource resource = new ClassPathResource("spring-servlet.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring-servlet.xml");
		EmpDbTest empdao = (EmpDbTest)factory.getBean("d");
		Employee emp = new Employee();
		emp.setEmail("email test");
		emp.setFirstName("firstName");
		emp.setLastName("lastName");
		empdao.saveEmployee(emp);
	}

}
