package HashTableDoubleHashing;

import java.util.Scanner;

public class HashTableDoubleHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the hash table
        System.out.print("Enter size of hash table: ");
        int size = sc.nextInt();

        int[] hashTable = new int[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1; // -1 means empty
        }

        // Input: Second hash value (must be less than table size and co-prime)
        System.out.print("Enter second hash value (for double hashing): ");
        int hash2 = sc.nextInt();

        // Input: Number of keys to insert
        System.out.print("Enter number of keys to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " keys:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int index1 = key % size;
            int index2 = hash2 - (key % hash2); // Secondary hash

            int j = 0;
            int index = index1;

            // Double hashing probing
            while (hashTable[index] != -1 && j < size) {
                j++;
                index = (index1 + j * index2) % size;
            }

            if (j == size) {
                System.out.println("Hash table is full. Could not insert key: " + key);
            } else {
                hashTable[index] = key;
            }
        }

        // Output: Final Hash Table
        System.out.println("\nFinal Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (hashTable[i] == -1 ? "Empty" : hashTable[i]));
        }
    }
}

