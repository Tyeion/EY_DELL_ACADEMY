package com.pardeep.Tyeion16Aug;

public class PersonData implements Cloneable{

	int personId;
	String personName;
	
	PersonData(int personId,String personName)
	{
		this.personId=personId;
		this.personName=personName;
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	 {
		
		PersonData obj1=new PersonData(234, "JED");
		PersonData obj2=(PersonData) obj1.clone();
	
		System.out.println("Person Id is "+ obj1.personId +" and name"+ obj1.personName);
		System.out.println("Person id is"+ obj2.personId +" and name "+obj2.personName);
		
		//Cloning
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	
}
