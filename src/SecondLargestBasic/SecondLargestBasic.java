package SecondLargestBasic;

import java.util.Scanner;

public class SecondLargestBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // First, find the largest
        int largest = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Then, find the second largest
        int secondLargest = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] != largest) {
                if(secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        if(secondLargest == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

        sc.close();
    }
}
