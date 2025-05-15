package ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read N elements into the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array in-place
        int start = 0;
        int end = N - 1;
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
