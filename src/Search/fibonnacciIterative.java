package Search;

import java.util.Scanner;

public class fibonnacciIterative {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		fibonaccio(num);
	}

	private static void fibonaccio(int num) {
		int n3, n1=0,n2=1;
		for(int i=0;i<num;i++) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}