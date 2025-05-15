package Search;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of element in a array:-");
		int a = s.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements:");
		for (int i = 0; i < a; i++) {
			arr[i] = s.nextInt();
		}
		int []k=insertionsort(arr);
		System.out.println();
		for(int a1:k) {
			System.out.println(a1);
		}
		
	}

	public static int[] insertionsort(int[] arr) {
		int a = arr.length;
		for (int i = 1; i < a; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
}