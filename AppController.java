package com.ems.controller;

import java.io.IOException;

import com.ems.employee.Employee;
import com.ems.service.EmployeeService;

public class AppController implements Controller {
	
	EmployeeService empService;

	@Override
	public void addEmployee(Employee e) throws IOException {
		empService.addEmployee(e);
	}

	@Override
	public void getEmployeeByID(int empID) {
		empService.getEmployeeByID(empID);
	}

	@Override
	public void deleteEmployee(int empID) {
		empService.deleteEmployee(empID);
	}

	@Override
	public void setEmployeeService(EmployeeService empSer) {
		this.empService=empSer;
	}

	@Override
	public void viewALlEmployee() {
		
		empService.viewALlEmployee();
	}


}


