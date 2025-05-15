package LinkedListandDeleteAlternate;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class linkedlist {

    // Function to reverse the linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Function to delete alternate nodes starting from second
    static void deleteAlternate(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node();
            newNode.data = sc.nextInt();
            newNode.next = null;

            if (head == null) {
                head = newNode;
            } else {
                // Insert at the end manually
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        deleteAlternate(head);
        head = reverse(head);
        printList(head);
    }
}
