package com.pardeep.Tyeion28Aug;

public class HeapSort {
	public static void main(String[] args) {
		int [] arr= {3,35,60,2,45,320,5};
		System.out.println("Before Heap Sort");
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
		
		HeapSort.heapsort(arr);
		System.out.println();
		System.out.println("After Heap Sort ");
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
		
	}
	
	static void heapsort(int [] arr) {
		int lengthOfAraay=arr.length;
		for(int i=lengthOfAraay/2-1;i>=0;i--)
		{
			heapify(arr,lengthOfAraay,i);
		}
		
		for(int i=lengthOfAraay-1;i>=0;i--)
		{
			//move current root element  to end and swap intArr[0] with intArr[length-1]
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr, i, 0);
		}
	}
	//remove the root element repeatedly by shifting to the end of the array then store heap with remaining elements
	// heap is a  complete binary tree and binary tree is a tree in which every node can have maximum of two children
	static void heapify(int [] arr, int lengthOfArray, int i)
	{
		int largestElement=i; //initialize largest as root
		int left=2*i+1;  //left child
		int right=2*i+2; //right child
		//if left child is greatest than root
		if(left<lengthOfArray && arr[left] > arr[largestElement])
		{
			largestElement=left;
		}
		//if right element is larger than root
		if(right <lengthOfArray && arr[right] >arr[largestElement])
		{
			largestElement=right;
		}
		
		//if root is not largest
		if(largestElement!=i) {
			//swap arr[i] with arr[largest]
			int temp=arr[i];
			arr[i]=arr[largestElement];
			arr[largestElement]=temp;
			
			heapify(arr, lengthOfArray, largestElement);
		}
	}
}
