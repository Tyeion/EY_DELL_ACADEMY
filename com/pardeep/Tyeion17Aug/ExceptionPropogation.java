package com.pardeep.Tyeion17Aug;

public class ExceptionPropogation {

	public static void main(String[] args) {
		System.out.println("Method Main");
		try {
			ExceptionPropogation obj=new ExceptionPropogation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("Main Method "+ e.getMessage());
		}
	}
	
	void a() throws InterruptedException{
		System.out.println("Method A ");
		b();
	}
	
	void b() throws InterruptedException {
		System.out.println("Method B");
		c();
		throw new InterruptedException("Thread Exception");
	}
	
	void c()
	{
		System.out.println("Method C");
	}
}
