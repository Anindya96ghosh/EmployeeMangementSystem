package com.ems.employee;

public class Employee {

	private String name;
	private int empID;
	private int salary;
	private static int ID=100;
	
	//no args constructor
	public Employee()
	{
		
	}
	
	//Parameterized Constructor
	public Employee(String name,int salary) {
		super();
		this.name = name;
		this.empID = ++ID;
		this.salary = salary;
	}
	

	//getters
	public String getName() {
		return name;
	}


	public int getEmpID() {
		return empID;
	}


	public int getSalary() {
		return salary;
	}

	//Overridden toString Method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + "]";
	}


}
