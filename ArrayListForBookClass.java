package com.pardeep.Tyeion21Aug;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookClass {
	public static void main(String[] args) {
		
		ArrayList<Book> arrList= new ArrayList<>();
		Book b1=new Book(1, "A", "B","C", 10);
		Book b2=new Book(32, "P", "Q","R", 100);
		Book b3=new Book(7, "M", "N","O", 10000);
		
		arrList.add(b1); arrList.add(b1);arrList.add(b1);
		arrList.add(b3);arrList.add(b2);arrList.add(b2);
		
		for(Book b:arrList)
		{
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		
		System.out.println("With Iterator");
		Iterator<Book> itr=arrList.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
	}
}
