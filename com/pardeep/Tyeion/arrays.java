package com.pardeep.Tyeion;

public class arrays {
//collection of same data type and having memory in continuity
	
	public static void main(String [] args)
	{
		int [] arr=new int[10]; //declaration
		
		//initialization
		
		arr[0]= 10;
		arr[6]=83;
		arr[7]=73;
		arr[8]=23;
		arr[2]=76;
		arr[1]=22;
		arr[2]=67;
		
		for(int i=0; i<=arr.length -1  ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();

        for(int i:  arr)
		{
			System.out.print(i+ " ");
		}
        
        
        int intArr []= {1,2,3,4,-8,6,6,67};
        System.out.println();
        min(intArr);
        
        System.out.println("*************************");
        
       
	}
	
	
	static void min(int[] jed)
	{
		int min=jed[0];
		for(int i=0;i<jed.length;i++)
		{
			if(min > jed[i])
			{
				min=jed[i];
			}
		}
		
		System.out.println("The minimum value in the array is :"+ min);
	}
}
