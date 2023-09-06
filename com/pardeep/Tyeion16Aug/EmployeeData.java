package com.pardeep.Tyeion16Aug;

public class EmployeeData {

	//non static
	int empId;
	String empName;
	
	static String orgAddress="ABC XYZ";
	
	static void orgAdress()
	{
		orgAddress ="MNO PQR";
	}
	
	EmployeeData(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	void display()
	{
		System.out.println("Id of the Emp is "+ empId +" and name of emp is "+ empName +
				" and org Address is "+ orgAddress);
		
	}
	
	public static void main(String[] args) {
		
		EmployeeData.orgAdress();
		EmployeeData e1=new EmployeeData(678 , "PARDEEP");
		EmployeeData e2=new EmployeeData(467 , "JAMES");
		
		e1.display();
		e2.display();
	}
}
