package practiceJava;

import java.util.Arrays;

public class PracticeBinarySearch {
	public static void main(String[] args) {
		int []arr= {65,87,55,77,99,889,96,43};
		Arrays.sort(arr);
		int target=889;
		int result=BinarySearch(arr,target);
		System.out.println("The element index is at "+result);
	}
	
	static int BinarySearch(int []arr, int target)
	{
		int left=0;int right=arr.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==target)
			{
				return mid;
			}else if(arr[mid]<target)
			{
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		
		return -1;
	}
}
