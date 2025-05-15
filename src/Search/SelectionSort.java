package Search;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of element in a array:-");
	int a = s.nextInt();
	int[] arr = new int[a];
	System.out.println("Enter the elements:");
	for (int i = 0; i < a; i++) {
		arr[i] = s.nextInt();
	}
	int []k=selectionsort(arr);
	System.out.println();
	for(int a1:k) {
		System.out.println(a1);
	}
	
	
}

public static int[] selectionsort(int[] arr) {
	int a = arr.length;
	for(int i=0;i<a-1;i++) {
		int min=i;
		for(int j=i+1;j<a-1;j++) {
			if(arr[min]>arr[j]) {
				min =j;
			}
		}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		
	}
	return arr;
}
}