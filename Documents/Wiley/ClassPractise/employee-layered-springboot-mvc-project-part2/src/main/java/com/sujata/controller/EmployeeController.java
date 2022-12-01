package com.sujata.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
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
//	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
	public ModelAndView deleteEmployeeController(@RequestParam("empId") int eId) {
		ModelAndView modelAndView=new ModelAndView();
		
//		int eId=Integer.parseInt(request.getParameter("empId"));
		
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
	//	public ModelAndView searchEmployeeByIDController(HttpServletRequest request) {
	public ModelAndView searchEmployeeByIDController(@RequestParam("empId") int id) {
		ModelAndView modelAndView = new ModelAndView();
		
//		Employee newEmp = employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empID")));
		Employee newEmp = employeeService.searchEmployeeById(id);
		
		String message = null;
		
		if (newEmp != null) {
			message = "Employee found. ID: " + newEmp.getEmpId() + " Name: " + newEmp.getEmpName() + " Department: " + newEmp.getEmpDepartment();
		} else {
			message = "Employee with ID: " + newEmp.getEmpId() + " not found";
		}
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	
	//===========================ADD=NEW=EMPLOYEE======================//
	@RequestMapping("/addEmployeePage")
	public ModelAndView addEmployeePageController() {
		//	return new ModelAndView("InputForAddEmployee");
		
		// first parameter - HTML file we're using
		// second parameter - name of value in HTML
		// third parameter - Object
		return new ModelAndView("InputForAddEmployee", "emp", new Employee());
	}
	
	
	
	// @ModelAttribute is super clever, we don't have to use this bulky code!
	// we insert "emp" to typecast over to the HTML page.
	// Now we don't have to pick each field manually, (if we had 100 lines it would be crazy)
	
	// String cannot be converted to LocalDate by @ModelAttribute, so we do it seperately with request.getParameter
	
	@RequestMapping("/addEmployee")
	//	public ModelAndView addEmployeeController(HttpServletRequest request) {
	public ModelAndView addEmployeeController(@ModelAttribute("emp") Employee employee, @RequestParam("doj") LocalDate date) {
		ModelAndView modelAndView = new ModelAndView();
		
		//		int empId = Integer.parseInt(request.getParameter("empId"));
		//		String empName = request.getParameter("empName");
		//		String empDesignation = request.getParameter("empDesignation");
		//		String empDepartment = request.getParameter("empDepartment");
		//		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		//		LocalDate empDateOfJoining = LocalDate.parse(request.getParameter("empDateOfJoining"));
		
		//		Employee newEmployee = new Employee(empId, empDateOfJoining, empDesignation, empDepartment, empName, empSalary);
		
		employee.setDateOfJoining(date);
		
		boolean addEmployee = employeeService.addEmployee(employee);
		
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
	
	
	//======================SEARCH=EMPLOYEE=BY=DESIGNATION=============//
	
	@RequestMapping("/searchEmpDesignationPage")
	public ModelAndView searchEmpDesignationPageController() {
		return new ModelAndView("InputDesignationForSearch");
	}
	
	@RequestMapping("/searchEmpDesignation")
//	public ModelAndView searchEmpDesignationController(HttpServletRequest request) {
	public ModelAndView searchEmpDesignationController(@RequestParam("empDesignation") String designation) {
		ModelAndView modelAndView = new ModelAndView();
		
		//		List<Employee> empList = employeeService.searchByDesignation(request.getParameter("empDesignation"));
		List<Employee> empList = employeeService.searchByDesignation(designation);
		
		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowDesignations");
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	//=====================GENERATE=PAYSLIP============================//
	
	@RequestMapping("/generatePayslipPage")
	public ModelAndView generatePaySlipPageController() {
		return new ModelAndView("InputIDForPaySlip");
	}
	
	
	@RequestMapping("/generatePayslip")
	//	public ModelAndView generatePaySlip(HttpServletRequest request) {	
	public ModelAndView generatePaySlip(@RequestParam("empId") int id) {
		ModelAndView modelAndView = new ModelAndView();

		//	EmployeePaySlip newPaySlip = employeeService.generatePaySlip(Integer.parseInt(request.getParameter("empID")));
		EmployeePaySlip newPaySlip = employeeService.generatePaySlip(id);
		
		String message = null;
		
		if (newPaySlip != null)
			message = "PaySlip Generated";
		  else 
			message = "Employee not found. No PaySlip Generated";
			
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}

	//=================================================================//
	
	
	//===================DELETE=EMPLOYEE=BY=NAME========================//
	
	@RequestMapping("/deleteEmpByNamePage")
	public ModelAndView deleteEmpByNamePageController() {
		return new ModelAndView("InputNameForDelete");
	}
	
	@RequestMapping("/deleteEmpByName")
	//	public ModelAndView deleteEmpByNameController(HttpServletRequest request) {
	public ModelAndView deleteEmpByNameController(@RequestParam("empName") String name) {
		ModelAndView modelAndView = new ModelAndView();

		//		String empName = request.getParameter("empName");
		//		boolean empDelete = employeeService.deleteEmployeeByName(empName);
		boolean empDelete = employeeService.deleteEmployeeByName(name);
		
		String message = null;
		
		if (empDelete)
			message = "Employee " + name + " successfully deleted.";
		else 
			message = "Employee " + name + " not deleted.";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	//=================================================================//
	
	
	
	
	@RequestMapping("/searchEmpByDeptPage")
	public ModelAndView searchEmpByDeptPageController() {
		return new ModelAndView("InputDeptForSearch");
	}
	
	
	@RequestMapping("/searchEmpDept")
	//	public ModelAndView searchEmpByDeptController(HttpServletRequest request) {
	public ModelAndView searchEmpByDeptController(@RequestParam("empDept") String dept) {
	ModelAndView modelAndView = new ModelAndView();
		
		List<Employee> empList = employeeService.getEmployeesByDepartment(dept);
	
		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowDesignations");
		
		return modelAndView;
	
	}
}
















