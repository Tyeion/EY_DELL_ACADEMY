package com.pardeep.Tyeion18Aug;

final public class FinalKeyword {

	final static String panCardNo;
	 final int number;
	 
	 FinalKeyword()
	 {
		 number=89;
	 }
	 
	 
	static {
		panCardNo= "ADFD7685H";
	}
	
	final void display()
	{
		System.out.println("Final Method");
	}
	
	public static void main(String[] args) {
		FinalKeyword obj=new FinalKeyword();
		System.out.println("Obj is "+ obj.panCardNo);
		System.out.println("Number is "+ obj.number);
	}
}
