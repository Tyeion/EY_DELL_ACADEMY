package com.pardeep.Tyeion21Aug;

import java.util.HashMap;
import java.util.Map;

public class HashMapForCustomClass {
		public static void main(String[] args) {
			HashMap<Integer, Book> hmap=new HashMap<>();
			
			Book b1= new Book(1, "A","B","C",10);
			Book b2=new Book(2,"P","Q","R",100);
			Book b3=new Book(3,"Z","N","M",100);
			hmap.put(123, b1);
			hmap.put(234, b2);
			hmap.put(121, b3);
			
			for(Map.Entry<Integer, Book> m: hmap.entrySet()) {
				int key= m.getKey();
				Book b=m.getValue();
				System.out.println("Key "+key+" details are : ");
				System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
			}
		}
}
