package com.pardeep.Tyeion21Aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {

	
	public static void main(String[] args) {
		
	
	int [] intArr= {12,23,34,56,78,54,56,89,4};
	Arrays.sort(intArr);
	System.out.println("Sorted Integer arrays is "+ Arrays.toString(intArr));
	
	String[] strArr= {"Z","N","M","D"};
	Arrays.sort(strArr);
	System.out.println("Sorted :"+ Arrays.toString(strArr));
	
	List<String> listStr=new ArrayList<>();
	listStr.add("Z");listStr.add("A");listStr.add("Z");listStr.add("Y");listStr.add("X");
	
	Collections.sort(listStr){
		for(String str: listStr)
		{System.out.println(str + " ");}
	}
	}
}
