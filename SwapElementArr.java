package com.pardeep.Tyeion28Aug;

public class SwapElementArr {
public static void main(String[] args) {

	int []arr= {20,3,4,-20,100,12,0,-1};
	System.out.println("Elemenst before Swapping : ");
	for(int i:arr)
	{
		System.out.print(i + " ");
	}
	
  Swap(arr,4,7);	
	System.out.println(); 
	System.out.println("Elements after swapping ");
	for(int i: arr) {
		System.out.print(i+" ");
	}
}

static void Swap(int [] arr,int firstIndex,int secondIndex) {

	int temp=arr[firstIndex];
	arr[firstIndex]=arr[secondIndex];
	arr[secondIndex]=temp;
}
}
