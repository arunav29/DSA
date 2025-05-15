package Search;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 7, 6, 7, 5, 4, 3, 6, 7, 9, 1, 2 };
		int target = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.print(i + " ");
			}
		}
	}
}