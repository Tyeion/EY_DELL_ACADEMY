package com.pardeep.Tyeion;


import java.util.Arrays;

public class Arr {

	public static void main(String [] args)
	{
		int [] intArr2 = {1,2};
		int [] intArr1 = {1,2};
		
		boolean[] binArr1  = {true,false};
		boolean[] binArr2  = {true,false};
		
		if(intArr1==intArr2) {
			System.out.println("== Works");
		}else {
			System.out.println("Do not work");
		}
		
		if(binArr1==binArr2) {
			System.out.println("== Works");
		}else {
			System.out.println("Do not work");
		}
		
		boolean result = Arrays.equals(binArr1, binArr2); 
		System.out.println("result "+result);
				
	}
}
