package com.pardeep.Tyeion21Aug;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<>();
		hset.add("Z");hset.add("Z");hset.add("Z");
		hset.add(null);hset.add(null);
		hset.add("One");hset.add("bottle");hset.add("Down");
		hset.add("X");hset.add("A");hset.add("Y");
		Iterator<String> itr=hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		
	}
}
