package HashTableLinearProbing;

import java.util.Scanner;

public class HashTableLinearProbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read table size
        System.out.print("Enter size of hash table: ");
        int size = sc.nextInt();

        // Initialize hash table with -1 (indicating empty slots)
        int[] hashTable = new int[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1;
        }

        // Read number of keys to insert
        System.out.print("Enter number of keys to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " keys:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int index = key % size;

            // Linear probing in case of collision
            while (hashTable[index] != -1) {
                index = (index + 1) % size;
            }

            hashTable[index] = key;
        }

        // Output final hash table
        System.out.println("Final Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (hashTable[i] == -1 ? "Empty" : hashTable[i]));
        }
    }
}

