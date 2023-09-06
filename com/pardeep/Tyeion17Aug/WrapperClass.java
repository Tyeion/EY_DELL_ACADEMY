package com.pardeep.Tyeion17Aug;

public class WrapperClass {
		public static void main(String[] args) {
			byte grade=2;
			short marks=39;
			float price = 8.3f;
			double rate= 234.3D;
			boolean flag=false;
			char initial='a';
			
			//Autoboxing 
			Byte bobj=new Byte(grade);
			Short sobj=new Short(marks);
			System.out.println("Data type grade is " + grade);
			System.out.println("Object bObject is "+ bobj);
			
			byte byteValue= bobj.byteValue(); //unboxing
			System.out.println(byteValue);
		}
}
