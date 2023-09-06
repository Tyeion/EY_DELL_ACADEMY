package com.pardeep.Tyeion22Aug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnboundWildClass {
	public static void main(String[] args) {
		UnboundWildClass obj=new UnboundWildClass();
		List<String> list=new ArrayList<>();
		list.add("ABC");
		list.add("ZXC");
		obj.printCollectionData(list);
		
		List<Integer> listInt=new ArrayList<Integer>();
		listInt.add(244);
		listInt.add(799);
		obj.printCollectionData(listInt);
	}
	
	void printCollectionData(Collection<?> objToprint) {
		System.out.println(" {");
		for(Object obj:objToprint)
		{
			System.out.println(obj.getClass().getCanonicalName()+" : "+obj);
		}
		System.out.println(" }");
		System.out.println();
	}
}
