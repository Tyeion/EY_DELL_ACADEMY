package com.pardeep.Tyeion24Aug;

interface TestInteerface{
	public void square(int data);
	
	default void show() {
		System.out.println("Only  for one class , defalut dmethod is defined,"
				+ "so that other classes don't have to implement  this ");
	}
	
}

public class DefaultKeyWordFunctionality implements TestInteerface{
   @Override
   public void square(int data)
   {
	   System.out.println(data*data);
   }
   
   public static void main(String[] args) {
	DefaultKeyWordFunctionality obj=new DefaultKeyWordFunctionality();
	obj.square(456);
	obj.show();
}
}
