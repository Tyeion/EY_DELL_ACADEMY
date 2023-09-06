package practiceJava;

public class PracticeBubbleSort {
 public static void main(String[] args) {
	 int arr[]= {78,5,3,89,90,54};
	 BubbleSort(arr);
	 System.out.println();
	 for(int i=0;i<arr.length-1;i++)
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
