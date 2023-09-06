package com.pardeep.Tyeion17Aug;

import java.sql.SQLException;

class Parent{
	void show() throws SQLException, Exception
	{
		System.out.println("Parent class method");
	}
}



public class ExceptionHandlingRules extends Parent {
	
	@Override
	void show () throws Exception
	{
		System.out.println("Child Class Exception");
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionHandlingRules p=new ExceptionHandlingRules();
		p.show();
		
		Parent p1=new ExceptionHandlingRules();
		p1.show();
		
		Parent p2=new Parent();
		p2.show();
	}
}
