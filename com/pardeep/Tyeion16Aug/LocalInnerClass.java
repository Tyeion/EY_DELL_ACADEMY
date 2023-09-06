package com.pardeep.Tyeion16Aug;

public class LocalInnerClass {
	private int data=93;
	
	void message() {
	class XYZ{
		void show()
		{
			System.out.println("Value of data "+ data);
		}	
		}
	XYZ obj=new XYZ();
	obj.show();
	}
	
	public static void main(String[] args) {
		LocalInnerClass obj2=new LocalInnerClass();
		obj2.message();
	}
}
