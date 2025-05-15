package HappyNumbers;

import java.util.Scanner;

public class HappyNumbers {
	 // Function to calculate the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;    // Extract the last digit
            sum += digit * digit;  // Square the digit and add to sum
            n /= 10;               // Remove the last digit
        }
        return sum;
    }
    
    // Function to check if a number is happy and return the number of iterations
    public static int isHappy(int n) {
        int count = 0;
        int current = n;
        
        // Loop up to 10 times to see if it reaches 1 or if we fall into a loop
        while (current != 1 && count < 10) {
            current = sumOfSquaresOfDigits(current);  // Get the next number in the sequence
            count++;  // Increment the count of iterations
        }
        
        // If it reached 1 within 10 iterations, it is a happy number
        if (current == 1) {
            return count;
        }
        
        // If it doesn't reach 1 within 10 iterations, it is an unhappy number
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the interval (two integers a and b)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Loop through all numbers in the interval [a, b]
        for (int i = a; i <= b; i++) {
            int iterations = isHappy(i);  // Check if the number is happy and get the iterations
            if (iterations != -1) {  // If it is happy
                System.out.println(i + " " + iterations);  // Print the number and iterations
            }
        }
        
        scanner.close();
    }

}
