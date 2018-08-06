package com.ems.controller;

import java.io.IOException;

import com.ems.employee.Employee;
import com.ems.service.EmployeeService;

public interface Controller {

	public void getEmployeeByID(int empID);
	public void deleteEmployee(int empID);
	
	public void setEmployeeService(EmployeeService empSer);
	public void addEmployee(Employee e) throws IOException;
	public void viewALlEmployee();
	
	
}


