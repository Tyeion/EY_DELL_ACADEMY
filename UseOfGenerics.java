package com.pardeep.Tyeion22Aug;


class MyGeneralizedClass<T>{
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
}
public class UseOfGenerics {
  public static void main(String[] args) {
	MyGeneralizedClass<String> intType= new MyGeneralizedClass<>();
	intType.add("21");
	intType.add("31");
	//	intType.add("41");
	//intType.add("ABC"); //Compile Time error will come if I try to add
	//any other data apart from String
	
	
	System.out.println(intType.get());
	
	MyGeneralizedClass<Boolean> boolType= new MyGeneralizedClass<>();
	boolType.add(true);
	boolType.add(false);
	//	intType.add("41");
	//intType.add("ABC"); //Compile Time error will come if I try to add
	//any other data apart from boolean
	
	
	System.out.println(boolType.get());
	
}
}
