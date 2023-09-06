package com.pardeep.Tyeion28Aug;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int [] arr= {10,2,4,24,67,8,3};
	Arrays.sort(arr);
	int lookOutFor = 4;
	int lastElement= arr.length-1;
	int result=binarySearch(arr, lookOutFor);
	System.out.println("the element is at index "+ result);
}
 
public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
}
