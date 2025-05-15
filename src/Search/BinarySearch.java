package Search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		// Always a sorted array for applying binary search
		int s = 0;
		int e = arr.length;

		int target = 5;
		int a = binarysearh(arr, target, 0, e - 1);
		System.out.println(a);
	}

	public static int binarysearh(int arr[], int target, int s, int e) {
		if (e >= s) {
			int mid = s + (e - s) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target > mid) {
				return binarysearh(arr, target, mid + 1, e);
			}
			return binarysearh(arr, target, s, mid - 1);
		}
		return -1;
	}
}