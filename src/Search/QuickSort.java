package Search;

import java.util.Arrays;

public class QuickSort {
public static void main(String[] args) {
	int arr[]= {10,7,8,9,1,5};
	int n = arr.length;
	quicksort(arr,0,n-1);
	System.out.println(Arrays.toString(arr));
}

public static void quicksort(int[] arr, int low, int high) {
	if(low<high) {
	int a = partition(arr,low,high);
	quicksort(arr,low,a-1);
	quicksort(arr,a+1,high);
}
}

public static int partition(int[] arr, int low, int high) {
	int pivot=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++) {
		if(arr[j]<pivot) {
			i++;
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	return i+1;
	
}
}
	