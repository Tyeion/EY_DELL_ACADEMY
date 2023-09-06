package practiceJava;

import java.util.Scanner;
import java.util.Arrays;

public class arraysPractice {

	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	
	int []arr= new int[size];
	//feeding the data, populating the array
	System.out.println("Enter the elements of the array: ");
	for(int i=0;i<size ;i++)
	{
		arr[i]=sc.nextInt();
	}
	
     System.out.println("elemetns of the array");	
     
     for(int x: arr)
     {
    	 System.out.print(x+ " ");
     }
    
     System.out.println();
     
     MINI(arr);
	 MAXI(arr);
	 timesRepeatation(arr,4);
	 
	 System.out.println("Sorted ARRAY");
	 
	 Arrays.sort(arr);
	 
	 System.out.println(Arrays.toString(arr));
     
	}
	
	static void MINI(int [] arr) {
		int number=arr[0];
		for(int i=0;i<arr.length - 1 ; i++)
		{
			if(number > arr[i])
			{
				number=arr[i];
			}
		}
		
		System.out.println("The minimu value in the array is "+ number);
	}
	
	
	
	static void MAXI(int [] arr)
	{
		int number=arr[0];
		for(int i=0;i<arr.length -1;i++)
		{
			if(number < arr[i])
			{
				number=arr[i];
			}
		}
		
		System.out.println("The maximum value in the array is "+ number);
	}
	
	static void timesRepeatation(int []arr, int x)
	{
		int chad=0;		
		for(int i=0;i<arr.length -1;i++) {
			if(arr[i]==x)
				chad++;
		}
		
		System.out.println("The times of the number appeared in the array "+ chad);
	}
}
