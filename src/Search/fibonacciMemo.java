package Search;

import java.util.Scanner;

public class fibonacciMemo {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a number:-");
	int a = s.nextInt();
	long [] memo = new long[a+2];
	long start=System.nanoTime();
	for(int i =0;i<a;i++) {
		System.out.println(fib(i,memo));
	}
	long e=System.nanoTime();
	System.out.print("Total execution time:- "+(e-start));
}

private static long fib(int a, long[] memo) {
	 if(memo[a]!=0) {
		 return memo[a];
	 }
	 else if(a<=1) {
		 return a;
	 }else {
		return memo[a]=fib(a-1,memo)+fib(a-2,memo); 
	 }
}
}