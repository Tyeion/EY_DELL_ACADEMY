package com.pardeep.Tyeion21Aug;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

 public static void main(String[] args) {
	HashMap<Integer,String> hMap=new HashMap<>();
	hMap.put(123, "ABC");
	hMap.put(123, null);
	hMap.put(121, null);
	hMap.put(null, "PQR");
	hMap.put(135, "PQR");
	
	for(Map.Entry<Integer, String> m: hMap.entrySet())
	{
		System.out.println(m.getKey()+ " "+m.getValue());
	}
	
}
	
}
