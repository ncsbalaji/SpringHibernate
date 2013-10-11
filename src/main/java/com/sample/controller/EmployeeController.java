package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sample.form.Employee;
import com.sample.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/index")
	public ModelAndView listContacts(){
		return new ModelAndView("home");
	}
	
	@RequestMapping("/employees/add")
	public ModelAndView addEmpPage(){
		ModelAndView modelAndView = new ModelAndView("addEmp");
		modelAndView.addObject("emp",new Employee());
		return modelAndView;
	}
	
	@RequestMapping(value = "/employees/add/process")
	public ModelAndView addingEmployee( @ModelAttribute Employee emp ){
		employeeService.addEmployee(emp);
		ModelAndView modelAndView = new ModelAndView("home");
		String message = "employee successfully added";
		modelAndView.addObject("message",message);
		return modelAndView;
	}
	
	@RequestMapping( value = "/employees/list" )
	public ModelAndView listEmployees(){
		ModelAndView modelAndView = new ModelAndView("listEmp");
		List<Employee> empList = employeeService.listEmployees();
		modelAndView.addObject("empList",empList);
		return modelAndView;
	}
	
	@RequestMapping( value = "/employee/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editEmpPage(@PathVariable Integer id){
		Employee emp = (Employee) employeeService.getEmployee(id);
		ModelAndView modelAndView = new ModelAndView("editEmp");
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}
	
	@RequestMapping( value = "/employee/edit/{id}", method = RequestMethod.POST )
	public ModelAndView editEmp( @ModelAttribute Employee emp, @PathVariable Integer id){
		emp.setId(id);
		System.out.println(emp.getId()+" "+emp.getFirstName()+" "+emp.getLastName()+" "+emp.getEmail()+" "+emp.getTelephone());
		Employee updateEmp = new Employee();
		updateEmp.setId(id);
		updateEmp.setFirstName(emp.getFirstName());
		updateEmp.setLastName(emp.getLastName());
		updateEmp.setEmail(emp.getEmail());
		updateEmp.setTelephone(emp.getTelephone());
		employeeService.updateEmployee(updateEmp);
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("message", "Employee Successfully edited");
		return modelAndView;
	}
	
	@RequestMapping( value = "/employee/delete/{id}")
	public ModelAndView removeEmp(@PathVariable Integer id){
		employeeService.removeEmployee(id);
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("message", "employee deleted successfully");
		return modelAndView;
	}
}
