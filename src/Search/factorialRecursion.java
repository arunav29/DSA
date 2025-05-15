package Search;

import java.util.Scanner;

public class factorialRecursion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Factorial of the given number is :" + factorial(num));
		
	}

	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}else {
			return factorial(num -1) * num;
		}
	}
}