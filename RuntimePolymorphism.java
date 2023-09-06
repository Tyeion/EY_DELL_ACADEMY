package com.pardeep.Tyeion17Aug;

class Parent2 {
	void show()
	{
		System.out.println("Parent class");
	}
	
	int data=10;
}

public class RuntimePolymorphism extends Parent2 {
	
	@Override
	void show()
	{
		System.out.println("Child Class Funciton");
	}
	
	
	int data=20;
	void display()
	{
		this.show();
		System.out.println("This value of the data is "+ this.data);
		super.show();
		System.out.println("This value of the data is "+ super.data);
	}
	
	public static void main(String[] args) {
		Parent2 obj=new Parent2();
		obj.show();

		RuntimePolymorphism r=new RuntimePolymorphism();		
		r.show();

        Parent2 obj1=new RuntimePolymorphism();
        obj1.show();
//        obj1.display();
        
	}
}
