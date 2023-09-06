package com.pardeep.Tyeion28Aug;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 3, 35, 60, 2, 45, 320, -5, 0 };
		System.out.println("Before Merge Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		MergeSort.mergeSort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("After Merge Sort ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void mergeSort(int arr[], int beginingPosition, int endPosition) {
		if (beginingPosition < endPosition) {
			int midPosition = (beginingPosition + endPosition) / 2;
			mergeSort(arr, beginingPosition, midPosition);
			mergeSort(arr, midPosition + 1, endPosition);
			merge(arr, beginingPosition, midPosition, endPosition);
		}
	}

	static void merge(int arr[], int beginingPostion, int midPostion, int endPosition) {
		int i, j, k;
		int firstNumber = midPostion - beginingPostion + 1;
		int secondNumber = endPosition - midPostion;

		// temp array for sorting
		int leftAray[] = new int[firstNumber];
		int rightArray[] = new int[secondNumber];

		// copy data to temp array
		for (i = 0; i < firstNumber; i++) {
			leftAray[i] = arr[beginingPostion + i];
		}

		for (j = 0; j < secondNumber; j++) {
			rightArray[j] = arr[midPostion + 1 + j];
		}

		i = 0;// initial index of first sub array
		j = 0; // initial index of second sub array
		k = beginingPostion; // initial index of merged sub array

		while (i < firstNumber && j < secondNumber) {
			if (leftAray[i] <= rightArray[j]) {
				arr[k] = leftAray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < firstNumber) {
			arr[k] = leftAray[i];
			i++;
			k++;
		}

		while (j < secondNumber) {
			arr[k] = leftAray[j];
			j++;
			k++;
		}
	}
}
