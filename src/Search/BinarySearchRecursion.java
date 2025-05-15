package Search;

import java.util.Scanner;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 14, 18, 22, 55, 67 };
		int s=0,e=arr.length-1;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("The index of "+n+" is: "+BinarySearch(arr,n,s,e));
	}

	public static int BinarySearch(int[] arr, int n, int s, int e) {
		
		while(s<=e) {
			 int mid = (s+e)/2;
			if (n==arr[mid]) {
				return mid;
			}else if(n>arr[mid]){
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return -1;
	}
}