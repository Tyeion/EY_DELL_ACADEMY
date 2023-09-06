package com.pardeep.Tyeion21Aug;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
		public static void main(String[] args) {
			Vector<String> v=new Vector<>(10,5);
			v.addElement("Z");v.addElement("Z");v.addElement("Z");
			v.addElement("A");v.addElement("X");v.addElement("B");
			v.addElement("P");v.addElement("Q");
			
			System.out.println("Size of vector is "+ v.size());
			System.out.println("Capacity of vector is "+ v.capacity());
			
			Enumeration<String> en=v.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement() + " ");
			}
		}
}
