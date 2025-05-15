package SortAndSearch;

import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();            // number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)      // reading array
            arr[i] = sc.nextInt();

        int s = sc.nextInt();           // number to be searched

        // Step 1: Modified Bubble Sort
        bubbleSort(arr);

        // Step 2: Binary Search with comparison count
        int[] result = binarySearch(arr, s);

        // Output
        System.out.println(result[0]); // index of found element or -1
        System.out.println(result[1]); // number of comparisons
    }

    // Bubble Sort (modified to stop early if already sorted)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break early
            if (!swapped) break;
        }
    }

    // Binary Search: returns [index, comparisons]
    static int[] binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;
            if (arr[mid] == key)
                return new int[]{mid, comparisons};
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return new int[]{-1, comparisons};
    }
}
