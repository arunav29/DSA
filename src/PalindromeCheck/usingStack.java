package PalindromeCheck;

import java.util.Scanner;
import java.util.Stack;

public class usingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Input string

        // Convert to lowercase and remove spaces (optional based on input format)
        str = str.toLowerCase().replaceAll("\\s+", "");

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Compare characters while popping from stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (str.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
