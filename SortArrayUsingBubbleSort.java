package com.pardeep.Tyeion28Aug;

public class SortArrayUsingBubbleSort {
		 public static void main(String[] args) {
			int [] arr= {21,23,43,20,45,54,71,29};
			
			System.out.println("Before Buble Sort");
			for(int i=0;i<arr.length;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }
			
			BubbleSort(arr);
			System.out.println();
			System.out.println("After Bubble Sort ");
			for(int i=0;i<arr.length;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }
			
		}
		 

		 
		 static void BubbleSort(int [] arr)
		 {
			 int lengthOfArray=arr.length;
			 int temp=0;
			 for(int i=0;i<lengthOfArray;i++)
			 {
				 for(int j=1;j<(lengthOfArray-i);j++)
				 {
					 if(arr[j]<arr[j-1])
					 {
						 temp=arr[j-1];
						 arr[j-1]=arr[j];
						 arr[j]=temp;
					 }
				 }
			 }
		 }
}
