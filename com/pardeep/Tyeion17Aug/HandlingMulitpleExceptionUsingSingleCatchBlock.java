package com.pardeep.Tyeion17Aug;

public class HandlingMulitpleExceptionUsingSingleCatchBlock {
	public static void main(String[] args) {
		try 
		{
			HandlingMulitpleExceptionUsingSingleCatchBlock obj=new HandlingMulitpleExceptionUsingSingleCatchBlock();
			
		}
		catch(NullPointerException | ArithmeticException | IndexOutOfBoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
