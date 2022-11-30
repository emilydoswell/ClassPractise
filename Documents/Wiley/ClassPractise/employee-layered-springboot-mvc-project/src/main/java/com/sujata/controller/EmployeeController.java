package com.sujata.controller;

import java.time.LocalDate;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView menuPageController() {
		return new ModelAndView("index");
	}
	
	//==================DELETE=EMPLOYEE=================================//
	
	@RequestMapping("/deleteEmpPage")
	public ModelAndView deletePageController() {
		return new ModelAndView("InputIdForDelete");
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		int eId=Integer.parseInt(request.getParameter("empId"));
		String message=null;
		if(employeeService.deleteEmployee(eId))
			message="Employee Deleted with ID "+eId;
		else
			message="Employee with ID "+eId+" doesnot exist";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	//=================================================================//
	
	//==============INCREMENT=SALARY===================================//
	@RequestMapping("/incrementSalaryPage")
	public ModelAndView incrementSalaryPageController() {
		return new ModelAndView("InputSalaryForIncrement");
	}
	
	@RequestMapping("/incrementSalary")
	public ModelAndView incrementSalaryEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		
		int eId = Integer.parseInt(request.getParameter("empId"));
		int incrSalary = Integer.parseInt(request.getParameter("incrementSalary"));
		
		if (employeeService.searchEmployeeById(eId) != null) {
			boolean incrementSalary = employeeService.incrementSalary(eId, incrSalary);
			if (incrementSalary) {
				message = "Successfully incremented salary";
			}
		} else {
			message = "This employee does not exist";
		}
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	//======================LIST=ALL===================================//
	// We only have one method here because we're not getting an input from the client
	
	@RequestMapping("/showAll")
	public ModelAndView getAllEmployeesController() {
		ModelAndView modelAndView = new ModelAndView();
		Collection<Employee> empList = employeeService.getAllEmployees();
		
		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowAllEmployees");
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	
	//=====================SEARCH=EMPLOYEE=BY=ID========================//
	
	@RequestMapping("/searchEmpIdPage")
	public ModelAndView searchEmployeeByIDPageController() {
		return new ModelAndView("InputIdForSearch");
	}
 	
	@RequestMapping("/searchEmpId")
	public ModelAndView searchEmployeeByIDController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empID")));
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	
	//===========================ADD=NEW=EMPLOYEE======================//
	@RequestMapping("/addEmployeePage")
	public ModelAndView addEmployeePageController() {
		return new ModelAndView("InputForAddEmployee");
	}
	
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		String empDesignation = request.getParameter("empDesignation");
		String empDepartment = request.getParameter("empDepartment");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		LocalDate empDateOfJoining = LocalDate.parse(request.getParameter("empDateOfJoining"));
		
		Employee newEmployee = new Employee(empId, empDateOfJoining, empDesignation, empDepartment, empName, empSalary);
		
		boolean addEmployee = employeeService.addEmployee(newEmployee);
		
		String message = null;
		
		if (addEmployee)
			message = "You have successfully added this employee";
		else
			message = "This employee was not added";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	
	//=================================================================//
	
	@RequestMapping("/searchEmpDesignationPage")
	public ModelAndView searchEmpDesignationPageController() {
		return new ModelAndView("InputDesignationForSearch");
	}
}
















