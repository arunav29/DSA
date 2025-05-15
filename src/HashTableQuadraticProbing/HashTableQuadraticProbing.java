package HashTableQuadraticProbing;

import java.util.Scanner;

public class HashTableQuadraticProbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the hash table
        System.out.print("Enter size of hash table: ");
        int size = sc.nextInt();

        int[] hashTable = new int[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1; // -1 indicates an empty slot
        }

        // Input: Number of keys to insert
        System.out.print("Enter number of keys to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " keys:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int index = key % size;
            int j = 0;
            int newIndex = index;

            // Quadratic probing: (index + j^2) % size
            while (hashTable[newIndex] != -1 && j < size) {
                j++;
                newIndex = (index + j * j) % size;
            }

            if (j == size) {
                System.out.println("Hash table is full. Could not insert key: " + key);
            } else {
                hashTable[newIndex] = key;
            }
        }

        // Output: Final Hash Table
        System.out.println("\nFinal Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (hashTable[i] == -1 ? "Empty" : hashTable[i]));
        }
    }
}
