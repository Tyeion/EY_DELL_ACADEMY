package com.pardeep.Tyeion21Aug;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
	
		Hashtable<Integer,String> hMap=new Hashtable<>();
		hMap.put(123, "ABC");
		hMap.put(135, "MNO");
		
		hMap.remove(135);
		
		for(Map.Entry<Integer, String> m:hMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
