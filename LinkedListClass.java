package com.pardeep.Tyeion21Aug;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
		public static void main(String[] args) {
			LinkedList<String> list=new LinkedList<>();
			
			list.add("A");list.add("A");list.add("A");
			
			//any number of null is allowed
			list.add(null);list.add(null);
			
			list.add("Z");list.add("N");list.add("M");list.add("D");
			
			list.addFirst("First Element");
			list.addLast("LAST ELEMENT");
			
			//Object class is used because 
			Object firstElement=list.getFirst();
			
			System.out.println("First Element is "+firstElement);
			
			Object lastElement=list.getLast();
			System.out.println("Last element is "+ lastElement);
			
			int position = list.indexOf("Z");
			System.out.println("Position of Z is "+ position);
			
			int lastPositionOfA =list.lastIndexOf("A");
			System.out.println("Position of last A is "+ lastPositionOfA);
			
			list.add(0 , "Added element at 0 index");  
			list.remove(2); //remove element from the 2 index
			
			list.removeFirst();
			list.removeLast();
			
			list.removeFirstOccurrence("A");
			list.removeFirstOccurrence("A");
			
			Object o=list.poll();
			Object o2=list.pollLast();
			
//			Iterator<String> itr=list.iterator();
//			while(itr.hasNext())
//			{
//				System.out.println(itr.next()+" ");
//			}
			
			//Linkedlist has special iterator named aa listiterator
			
			ListIterator<String> listItr=list.listIterator();
			
			while(listItr.hasNext())
			{
				System.out.println(listItr.next()+ " ");
			}
			
			System.out.println();
			while(listItr.hasPrevious())
			{
				System.out.println(listItr.previous()+" ");
			}
				
		}
}
