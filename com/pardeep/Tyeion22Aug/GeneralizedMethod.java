package com.pardeep.Tyeion22Aug;

public class GeneralizedMethod {
public static void main(String[] args) {
	Integer[] intArr= {12,4,5,78,45,78};
	String[] strArr= {"Z","A","X","B","W"};
	
	System.out.println("Printing Integer Array");
	printArray(intArr);
	
	System.out.println("Printing String Array");
	printArray(strArr);
}

	static <E> void printArray(E[] elements)
	{
		for(E e: elements)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
