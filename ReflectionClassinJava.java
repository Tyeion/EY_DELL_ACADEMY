package com.pardeep.Tyeion21Aug;

class SampleClass{
	interface MyInterface{}
}

public class ReflectionClassinJava {
	void printName(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		SampleClass obj=new SampleClass();
		
		ReflectionClassinJava rC=new ReflectionClassinJava();
		rC.printName(obj);
		
		Class c=boolean.class;
		System.out.println(c.getName());
		
		Class c2=ReflectionClassinJava.class;
		System.out.println(c2.getName());
		
		
	   Class c4=Class.forName("com.pardeep.Tyeion21Aug.ReflectionClassinJava");
	   System.out.println(c4.getName());
	}
	
	
}
