package com.pardeep.Tyeion22Aug;

public class MethodReferenceExample {

	@FunctionalInterface
	public static interface Converter<F,T>{
		T convert(F from);
	}
	
	public static void main(String[] args) {
		Converter<String, Integer> intConverter = (from) -> Integer.valueOf(from);
		Integer convertedValue = intConverter.convert("231");
		System.out.println("Integer Value is "+ convertedValue);
		
		//Doing same thing with method reference
		Converter<String , Integer> intConverter2= Integer::valueOf;
		Integer convertedValue2= intConverter2.convert("7890");
		System.out.println("Integer Value is "+convertedValue2);
		
		StartingAlphabet obj=new StartingAlphabet();
		
		Converter<String, String> strCon = obj::startsWith;
		String value= strCon.convert("Java");
		System.out.println(value);
		
		PersonFactor<Person> personobject = Person::new;
		Person person = personobject.create("Core" , "Java");
		System.out.println("Person name is "+ person.firstName+" "+ person.lastName);
	}
	
	static class StartingAlphabet{
		String startsWith(String str)
		{
			return String.valueOf(str.charAt(0));
		}
	}
	
	interface PersonFactor<P extends Person>{
		P create(String firstName, String lastName);
	}
}

class Person{
	String firstName;
	String lastName;
	Person(){};
	Person(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
}
