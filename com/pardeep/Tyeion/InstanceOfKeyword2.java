package com.pardeep.Tyeion;

interface ABC{}

class Parent implements ABC{};
class child1 extends Parent{}
class child2 extends Parent{
	
}

public class InstanceOfKeyword2 {
     public static void main(String[] args) {
		Parent p= new Parent();
		child1 c1=new child1();
		child2 c2=new child2();
		
		System.out.println(p instanceof Parent); //true
		System.out.println(p instanceof child1); //false
		System.out.println(p instanceof child2); //false
		
		System.out.println(c1 instanceof Parent); //true
		System.out.println(c2 instanceof child2); //true
		
		System.out.println(c2 instanceof child2); //true
		System.out.println(c2 instanceof Parent); //true
		
		System.out.println(c1 instanceof ABC); //true
	}
}
