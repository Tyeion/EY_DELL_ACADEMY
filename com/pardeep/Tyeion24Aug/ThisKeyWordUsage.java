package com.pardeep.Tyeion24Aug;

public class ThisKeyWordUsage {

	int data=30;
	
	void display() {
		int data=20;
		System.out.println("value of locald varaible is "+ data);
		System.out.println("Value of instance variable is "+ this.data);
	}
	
	void display(int data) {
//		int data=20;
		System.out.println("value of locald varaible is "+ data);
		this.data=data;
		System.out.println("Value of instance variable is "+ this.data);
	}
	
	public static void main(String[] args) {
		ThisKeyWordUsage obj=new ThisKeyWordUsage();
		obj.display();
		obj.display(78);
		obj.display();
	}
}
