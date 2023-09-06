package com.pardeep.Tyeion;

public class StringImmutable {
	public static void main(String [] args) {
		String str= new String("ABC");
	    System.out.println("1 - Value of str is "+ str);
	    str.concat("XYZ");
	    System.out.println("2 - Value of str is "+ str);
	    str.replace("A", "Z");
	    System.out.println("3 - Value of str is "+ str);
	
	    
	    //jdk  1.1 - synchronization - thread safe
	    StringBuffer sb = new StringBuffer("ABC");
	    System.out.println("5 - Value of str is "+ sb.toString());
	    sb.append("XYZ");
	    System.out.println("6 - Value of str is "+ sb.toString());
	    
	    //jdk 1.5 -Fast
	    StringBuilder sb2 = new StringBuilder("MNO");
	    System.out.println(" 7- Value of str is "+ sb2.toString());
	    sb2.append("XYZ");
	    System.out.println("8- Value of str is "+ sb2.toString());
	    
	    
	}
}
