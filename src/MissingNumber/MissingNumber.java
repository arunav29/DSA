package MissingNumber;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array (n - 1 elements)
        System.out.print("Enter the number of elements (N-1): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements from 1 to N with one missing:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Total numbers should be n + 1
        int N = n + 1;

        // Calculate expected sum of 1 to N
        int expectedSum = N * (N + 1) / 2;

        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        // Missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}
