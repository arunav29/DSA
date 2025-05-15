package Search;

import java.util.Scanner;

public class factorialIlterative {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to find factorial:-");
		int a = s.nextInt();
		System.out.println("The factorial of " + a + " number:- " + factorial(a));
	}

	public static int factorial(int a) {
		int result = 1;
		while (a != 0) {
			result = result * a;
			a--;
		}
		return result;

	}
}