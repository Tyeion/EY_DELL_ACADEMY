package com.pardeep.Tyeion21Aug;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListForBook {

	
	public static void main(String[] args) {
		Book b1=new Book(21,"L","M","N",90);
		Book b2=new Book(31,"X","Z","C",80);
		
		LinkedList<Book> list=new LinkedList<>();
		
		list.add(b1);
		list.add(b2);
		
		for(Book b:list)
		{
			System.out.println(b.bookId+" "+b.author+" "+b.publisher+" "+b.name+" "+b.quantity);
		}
		
		ListIterator<Book> listItr=list.listIterator();
		while(listItr.hasNext()) {
			Book b=listItr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
	}
}
