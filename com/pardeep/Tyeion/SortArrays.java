package com.pardeep.Tyeion;

import java.util.Arrays;

public class SortArrays {

	public static void main(String [] args) {
	int [] intArr= {10,4,8,56,34,98,90};
	Arrays.sort(intArr);
	System.out.println("Sorted Array is"+ Arrays.toString(intArr));
	
	String []strArr = {"A","a","D","d"};
	Arrays.sort(strArr);
	System.out.print("String" + Arrays.toString(strArr));
}
}
