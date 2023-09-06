package com.pardeep.Tyeion24Aug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysPrc {

	

	public static void main(String[] args) {
		Integer [] intArr=new Integer[2];
		intArr[0]=10;
		intArr[1]=20;
		
		
		ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(intArr));
				Iterator<Integer> list=arrList.iterator();
		while(list.hasNext()) {
				System.out.println(list.next()+" ");
			}
				
//		for(int i=0;i<intArr.length;i++)
//		{
//			System.out.print(intArr[i] + " ");
//		}
//		int [] inArr1= {23,34};
//		
//		for(int c: inArr1) {
//			System.out.print(c+" ");
//		}
	}
	
	
}
