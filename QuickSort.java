package com.pardeep.Tyeion28Aug;

import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

public class QuickSort {
 public static void main(String[] args) {
	 int [] arr= {3,35,60,2,45,320,-5,0};
		System.out.println("Before Heap Sort");
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
		
		QuickSort.quickSort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("After Heap Sort ");
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
}
 //here we first choose a pivot after partitioning, we rearrange the array into the sub array so watch element
 //in left subarray , element less then pivot are present and in right element greater that pivot are present
 //or equal to pivot
 static void quickSort(int [] arr,int startElement, int endElement)
  {
	  if(startElement < endElement)
	  {
		  int p=partition(arr,startElement,endElement);
		  quickSort(arr, startElement, p-1);
		  quickSort(arr, p+1, endElement);
	  }
  }
 
 static int partition(int []arr, int startPosition,int endPosition)
 {
	 int pivotEle=arr[endPosition];
	 int i=(startPosition-1);
	 
	 for(int j=startPosition;j<=endPosition ;j++)
	 {
		 //if current element is smaller than pivot
		 if(arr[j] <pivotEle)
		 {
			 i++; //increment index of smaller element is
			 int t=arr[i];
			 arr[i]=arr[j];
			 arr[j]=t;
		 }
	 }
	 
	 int t=arr[i+1];
	 arr[i+1]=arr[endPosition];
	 arr[endPosition]=t;
	 return (i+1);
 }
}
