package com.pardeep.Tyeion;

public class Employee {
	String name;
	int Salary;
	int ID;
	String designation;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public static void main(String [] args)
	{
		Employee emp=new Employee();
		emp.setDesignation("Software Engineer");
		emp.setID(713);
		emp.setName("PARDEEP KUAMR");
		emp.setSalary(50000);
		
		System.out.println("ID of the Employee is "+emp.getID());
		System.out.println("Name of the Employee is "+emp.getName());
		System.out.println("Designation of the Employee is "+emp.getDesignation());
		System.out.println("Salary of the Employee is "+emp.getSalary());
	}
	
}
