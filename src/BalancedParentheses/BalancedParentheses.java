package BalancedParentheses;

import java.util.Scanner;

public class BalancedParentheses {

    public static boolean isBalanced(String expr) {
        char[] stack = new char[expr.length()];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(') {
                stack[++top] = ch; // push
            } else if (ch == ')') {
                if (top == -1) return false; // nothing to match
                top--; // pop
            }
        }

        return top == -1; // stack should be empty if balanced
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses: ");
        String input = sc.nextLine();

        if (isBalanced(input))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        sc.close();
    }
}

