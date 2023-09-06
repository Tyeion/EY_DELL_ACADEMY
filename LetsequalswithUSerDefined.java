package com.pardeep.Tyeion16Aug;

import  java.util.Objects;

class Employee{
	String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName);
	}	
	
	
	
}

public class LetsequalswithUSerDefined {
    
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
				
		e1.setFirstName("ASDF");
		e2.setFirstName("ASDF");
		
		if(e1.equals(e2))
			System.out.println("SAME");
		else {
			System.out.println("NOT SAME");
		}
		
		System.out.println("Memory address "+ e1.hashCode());
		System.out.print("Memory address "+  e2.hashCode());
	}
}
