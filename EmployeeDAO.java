package com.ems.data;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

import com.ems.employee.Employee;

public class EmployeeDAO {

	
	
	Set<Employee> employeeSet=new LinkedHashSet<>();
	
	
	//logic to add an employee to the set
	public void addEmployee(Employee emp) throws IOException {

		employeeSet.add(emp);
	}
	
	////logic to view the set of employees 
	public void viewAllEmployee() {
		
		employeeSet.stream().forEach(System.out::println);
	}
	
	//logic to find an employee from the set on the basis of empID
	public void getEmployeeByID(int empID) {
		
		Employee employee=null;
		for(Employee emp:employeeSet)
		{
			if(emp.getEmpID()==empID)
			{
				employee=emp;
				System.out.println(employee);
			}
		}	
	}
	
	//logic to delete an employee from the set
	public void deleteEmployee(int empID) {
		
		Predicate<Employee> delEmp =Employee-> Employee.getEmpID()==(empID);
		employeeSet.removeIf(delEmp);
	}
	
}
