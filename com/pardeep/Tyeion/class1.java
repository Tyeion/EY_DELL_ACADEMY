package com.pardeep.Tyeion;


public class class1 {

	public static void main(String []args)
	{
		ABC : for(int i=1 ; i <=3 ;i++)
		{
			for(int j=1 ;j<=3 ; j++)
			{
				if(i==2 && j==2)
					break ABC;				
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("This is second loop");
		
		ABC : for(int i=1 ; i <=3 ;i++)
		{
			for(int j=1 ;j<=3 ; j++)
			{
				if(i==2 && j==2)
					continue ABC;				
				System.out.println(i+" "+j);
			}
		}
	}
}
