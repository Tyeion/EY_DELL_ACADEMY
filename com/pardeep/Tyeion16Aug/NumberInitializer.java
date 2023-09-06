package com.pardeep.Tyeion16Aug;

public class NumberInitializer {
   int number1;
   static int number2;
   
   static {
	   System.out.println("Static Inititalizer");
	   number2=100;
	   
   }
   
   NumberInitializer()
   {
	   number1=84;
   }
   
   public static void main(String[] args) {
	System.out.println("Main Method");
	
	System.out.println("The value of the "+ number2);
	
	NumberInitializer obj=new NumberInitializer();
	System.out.println("The value of the number1 is "+obj.number1);
	
}
}
