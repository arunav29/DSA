package Search;

import java.util.Scanner;

public class FibonaciiRecursion {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	long start=System.nanoTime();
	for(int i=0;i<num;i++) {
		System.out.print(fibonacci(i)+" ");
	}
	long e=System.nanoTime();
	System.out.println();
	System.out.print("Total execution time:- "+(e-start));
}

private static int fibonacci(int num) {
	if(num <= 1) {
		return num;
	}else {
		return fibonacci(num-1)+fibonacci(num-2);
	}
}
}