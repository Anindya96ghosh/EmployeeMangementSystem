package com.ems.employee;

public class Employee {

	private String name;
	private int empID;
	private int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int empID, int salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public int getEmpID() {
		return empID;
	}


	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + "]";
	}


}
