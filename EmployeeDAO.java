package com.ems.data;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

import com.ems.employee.Employee;

public class EmployeeDAO {

	
	
	Set<Employee> employeeSet=new LinkedHashSet<>();
	
	
	
	public void addEmployee(Employee emp) throws IOException {

		employeeSet.add(emp);
		//System.out.println("yoyoyoyoyo");
	}
	
	public void viewAllEmployee() {
		//System.out.println("yoyoyo");
		
		employeeSet.stream().forEach(System.out::println);
	}
	
	
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
		//return employee;
		
	}
	
	
	public void deleteEmployee(int empID) {
		
		Predicate<Employee> delEmp =Employee-> Employee.getEmpID()==(empID);
		employeeSet.removeIf(delEmp);
		
//		
//		for(Employee emp:employeeSet)
//		{
//			if(emp.getEmpID()==empID)
//			{
//				employeeSet.remove(emp);
//			}
//		}
	}
	
}
