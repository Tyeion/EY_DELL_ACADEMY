package com.pardeep.Tyeion22Aug;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutUseOfGenerics {
public static void main(String[] args) {
	ArrayList arrlist=new ArrayList();
	arrlist.add("ABC");
	arrlist.add(123);
	
	String str=(String) arrlist.get(0);
	Integer intData =(Integer) arrlist.get(1);
	
	Iterator itr=arrlist.iterator() ;
	while(itr.hasNext())
	{
		System.out.println(itr.next()+" ");
	}
}
}
