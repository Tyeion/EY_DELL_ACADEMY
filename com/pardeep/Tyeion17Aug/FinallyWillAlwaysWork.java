package com.pardeep.Tyeion17Aug;

public class FinallyWillAlwaysWork {
		public static void main(String[] args) {
			int result=0;
			System.out.println("Result is "+ result);
			result=sampleMethod();
		}
		static int sampleMethod()
		{
			try {
				return 123;
			}finally {
				System.out.println("Code just returning integer 123");
			}
		}
}
