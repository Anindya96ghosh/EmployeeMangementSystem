package com.ems.service;

import java.io.IOException;

import com.ems.data.EmployeeDAO;
import com.ems.employee.Employee;

public interface Services {

	
	public void getEmployeeByID(int empID);
	public void deleteEmployee(int empID);
	public void setEmployeeDAO(EmployeeDAO dao);
	public void addEmployee(Employee e) throws IOException;
	public void viewALlEmployee();

}
