package com.pardeep.Tyeion21Aug;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetWithBookClass {
public static void main(String[] args) {
	Book b1=new Book(87,"pardeep","Tyeion","Kumar",899);
	Book b2=new Book(27,"Pardeep","dfkja","Kumar",8999);
	//hashset, linkedhashset are similar but for treeset we need to do some effore
	TreeSet<Book> hs=new TreeSet<>();
	/*With tree set we need to implement compare to interface and in which we need to add to compare 
    to method(function) then this we need to write how we will compare our objects
	and then treeSet will not give class cast exception...	*/
	hs.add(b2);
	hs.add(b1);hs.add(b1);hs.add(b1);
	
	for(Book b:hs)
	{
		System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
	}
	
	Iterator<Book> itr=hs.iterator();
	while(itr.hasNext())
	{
		Book b=itr.next();
		System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
	}
}
}
