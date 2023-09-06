package practiceJava;

import java.util.Arrays;

public class PracticeQuickStart {
  public static void main(String[] args) {
	  int[] unsortedArray = {3, 1, 4, 1, 5, 9, 2, 6,-98 ,5, 3, 5,8,0};
      
      QuickSort(unsortedArray, 0, unsortedArray.length - 1);
      
      System.out.println(Arrays.toString(unsortedArray));
}
  
  public static void QuickSort(int []arr, int start,int end)
  {
	  if(start < end) {
		  int pivotIndex=partition(arr,start,end);
		  QuickSort(arr,start,pivotIndex-1);
		  QuickSort(arr, pivotIndex+1, end);
	  }
  }
  
  public static void Swap(int []arr,int i,int j) {
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
  
  public static int partition(int []arr,int low,int high)
  {
	  int pivot=arr[high];
	  int i=low-1;
	  
	  for(int j=low;j<high;j++) {
		  if(arr[j]<=pivot) {
			  i++;
			  Swap(arr,i,j);
			
		  }
	  }
	  Swap(arr,i+1,high);
	  return i+1;
  }
}
