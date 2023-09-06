package com.pardeep.Tyeion24Aug;

class Parent{
	
	void show() {
		System.out.println("Parent Class function - show");
	}
	
	int data=10;
}



public class SuperKeyword extends Parent{

	@Override
	void show()
	{
		System.out.println("Child Class function - show");
		
	}
	
	int data=20;
	void display()
	{
		System.out.println("The value of the current class object is "+ this.data);
		System.out.println("The Value of immediate parent class object is "+ super.data);
		this.show();
		super.show();
	}
	
	public static void main(String []args)
	{
		SuperKeyword obj=new SuperKeyword();
		obj.display();
	}
}
