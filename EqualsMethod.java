package com.pardeep.Tyeion16Aug;

public class EqualsMethod {

	
	public static void main(String[] args) {
		String s1="String is Immutable";
		String s2="String is Immutable";
		
		if(s1==s2)
		{
			System.out.println("== works for literals or constants");
		}else
		{
			System.out.println("== does not work for literals or consants");
		}
		
		//object
		String s3=new String("String is Immutable");
		String s4=new String("String is Immutable");
		
		if(s3==s4)
		{
			System.out.println("== works for literals or constants");
		}else
		{
			System.out.println("== does not work for literals or consants");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("Equals method work for objects");
		}else {
			System.out.println("Equals method does not work for object");
		}
		
		System.out.println("Memory address is "+ s3.hashCode());
		System.out.println("Memory address is "+s4.hashCode());
		
		
	}
}
