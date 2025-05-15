package Search;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of element in a array:-");
	int a = s.nextInt();
	int []arr=new int[a];
	System.out.println("Enter the elements:");
	for(int i =0;i<a;i++) {
		arr[i]= s.nextInt();
	}
	int []k=bubbleSort(arr);
	System.out.println();
	for(int a1:k) {
		System.out.println(a1);
	}
	
}

public static int[] bubbleSort(int[] arr) {
	int n = arr.length;
	for(int i =0;i<n-1;i++) {
		for(int j=0;j<n-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
}
}