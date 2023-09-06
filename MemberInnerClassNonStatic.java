package com.pardeep.Tyeion16Aug;

public class MemberInnerClassNonStatic {
   
	private int data = 10;
	
	class ABC{
		
		void show()
		{
			System.out.println("The value of data is  " + data);
		}
		
		class xyz{
//			private int data=8;
			void display()
			{
				System.out.println("the value of the dat is "+ data);
			}
		}
	
	}
	
	public static void main(String[] args) {
		MemberInnerClassNonStatic obj= new MemberInnerClassNonStatic();
		MemberInnerClassNonStatic.ABC obj2= obj.new ABC();
		obj2.show();
		MemberInnerClassNonStatic.ABC.xyz obj3= obj2.new xyz();
		obj3.display();
	}
	
}
