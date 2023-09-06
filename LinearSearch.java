package com.pardeep.Tyeion28Aug;

public class LinearSearch {
public static void main(String[] args) {
	
	int []arr= {67,8,5,98,9,44,8};
	int lengthOfArray=arr.length;
	int search=98;
	int index=searchProgram(arr,search)+1;

	System.out.println("Element is at index "+index);
}

public static int searchProgram(int [] arr,int find)
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==find)
			return i;
	}
	
	return -1;
}
}
