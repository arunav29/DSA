	package validbracket;

import java.util.Scanner;

public class ValidBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(isValid(str) ? "TRUE" : "FALSE");
        }
    }

    static boolean isValid(String s) {
        char[] stack = new char[255];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (top == -1) return false;
                char open = stack[top--];
                if (!matches(open, ch)) return false;
            }
        }

        return top == -1;
    }

    static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}

