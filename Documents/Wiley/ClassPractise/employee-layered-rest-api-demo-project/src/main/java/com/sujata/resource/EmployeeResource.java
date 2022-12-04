package com.sujata.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	public Collection<Employee> getAllEmployeesResource(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(path = "/employees/{eid}",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	public Employee searchEmployeeByIdResource(@PathVariable("eid") int id) {
		return employeeService.searchEmployeeById(id);
	}
	
	@RequestMapping(path = "/employees/employeepayslip/{employeeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeePaySlip generatePaySlipResource(@PathVariable("employeeId") int employeeId) {
		return employeeService.generatePaySlip(employeeId);
	}
}
