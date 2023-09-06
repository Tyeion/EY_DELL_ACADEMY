package com.pardeep.Tyeion;

public class Constructors {

	int number;
	
	Constructors(){  //default constructor
		
		number=100;
	}
	
	Constructors(int number)
	{
		this.number= number; //this keyword resolved the ambiguity between non static instance variable and method parameter. 
	}
	
	public static void main(String [] aa)
	{
		Constructors obj=new Constructors();
		System.out.println("Value - "+ obj.number);
		
		Constructors obj1=new Constructors(8686);
		System.out.println("Value - "+ obj1.number);
	}
}
