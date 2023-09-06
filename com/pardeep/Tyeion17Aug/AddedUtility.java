package com.pardeep.Tyeion17Aug;

public class AddedUtility {
	int add(int x,int y)
	{
		return x+y;
	}
	
	int add(int x,int y, int z)
	{
		return x+y+z;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		AddedUtility a=new AddedUtility();
		System.out.println("result  "+ a.add(78,87));
		System.out.println("result "+ a.add(78, 87 ,87));
		System.out.println("result " + a.add(87.9, 8.98));
	}
}
