package com.pardeep.Tyeion16Aug;

public class Counter {
    int count ; 
    static int jed;//remember the rules of static keyword
    
    Counter()
    {
    count++;	
    jed++;
    System.out.println("Count value is "+ count +" static varaible " +jed);
    }
    
    public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	}
}
