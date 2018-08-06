package com.ems.service;

import java.io.IOException;

import com.ems.data.EmployeeDAO;
import com.ems.employee.Employee;

public class EmployeeService implements Services{

	EmployeeDAO employeeDao;
	//= new EmployeeDAO();

	@Override
	public void addEmployee(Employee e) throws IOException {
		employeeDao.addEmployee(e);
	}

	@Override
	public void getEmployeeByID(int empID) {
		
		employeeDao.getEmployeeByID(empID);
	}

	@Override
	public void deleteEmployee(int empID) {
		employeeDao.deleteEmployee(empID);
		
	}

	@Override
	public void setEmployeeDAO(EmployeeDAO dao) {
		this.employeeDao=dao;
	}

	@Override
	public void viewALlEmployee() {
		employeeDao.viewAllEmployee();
	}

	

	
}
