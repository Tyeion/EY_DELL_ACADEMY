package com.pardeep.Tyeion17Aug;

public class UncheckedException {

	void abc()
	{
		System.out.println("HEY");
	}
	
	public static void main(String[] args) {
//		int dat=10/0;
		
//		System.out.println("Value is "+ dat);
		//ArtihmeticException
		
		UncheckedException e=new UncheckedException();
		e=null;
		e.abc();   //Will cause a null pointer exception.
		
	}
	
	
}
