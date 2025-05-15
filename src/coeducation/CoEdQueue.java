package coeducation;

import java.util.Scanner;

class Student {
    String name;
    char gender;
    Student next;

    Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.next = null;
    }
}

class StudentQueue {
    Student front;
    Student rear;
    int sentToAssembly = 0;

    // Method to add student to the queue
    void enqueue(String name, char gender) {
        Student newStudent = new Student(name, gender);

        if (rear == null) {
            front = rear = newStudent;
        } else {
            // Check gender of last student in queue
            if (rear.gender != gender) {
                rear.next = newStudent;
                rear = newStudent;
            } else {
                sentToAssembly++;  // Send to assembly stage
            }
        }
    }

    void displayQueue() {
        Student temp = front;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) {
                System.out.print(" => ");
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println(sentToAssembly);
    }
}

public class CoEdQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Number of students
        sc.nextLine(); // Consume newline

        StudentQueue queue = new StudentQueue();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            String name = parts[0];
            char gender = parts[1].charAt(0);
            queue.enqueue(name, gender);
        }

        queue.displayQueue();
    }
}
