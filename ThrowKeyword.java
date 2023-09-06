package com.pardeep.Tyeion17Aug;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) {
	  
	   try {
		   sampleMethod();	   
	   }catch(IOException e) {
		   System.out.println("Rest of the Code....");
	   }
	}
	
	static void sampleMethod() throws IOException{
		throw new IOException("Device Error!!!");
	}
}
