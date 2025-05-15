package ArrayRightRotate;

import java.util.Scanner;

public class ArrayRightRotate {

    // Function to rotate array to the right by k steps
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k > n
        reverse(arr, 0, n - 1);       // Step 1: Reverse whole array
        reverse(arr, 0, k - 1);       // Step 2: Reverse first k elements
        reverse(arr, k, n - 1);       // Step 3: Reverse the rest
    }

    // Function to reverse array from index 'start' to 'end'
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Rotate array
        rotateRight(arr, k);

        // Print result
        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

