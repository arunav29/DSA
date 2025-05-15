package CircularQueueMain;

import java.util.Scanner;

class CircularQueue {
    int front, rear, size;
    int[] queue;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == (rear + 1) % size);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        if (front == rear) {  // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class CircularQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of queue
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);

        // Read number of operations
        int ops = sc.nextInt();

        // Perform operations
        for (int i = 0; i < ops; i++) {
            String operation = sc.next();
            if (operation.equalsIgnoreCase("enqueue")) {
                int value = sc.nextInt();
                cq.enqueue(value);
            } else if (operation.equalsIgnoreCase("dequeue")) {
                cq.dequeue();
            } else if (operation.equalsIgnoreCase("display")) {
                cq.display();
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}

