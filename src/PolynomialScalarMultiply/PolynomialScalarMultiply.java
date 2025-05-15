package PolynomialScalarMultiply;
import java.util.Scanner;

public class PolynomialScalarMultiply {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] terms = new int[10][2]; // max 10 terms
        int count = 0;

        // Read polynomial terms
        while (true) {
            int coeff = sc.nextInt();
            int power = sc.nextInt();
            int flag = sc.nextInt();

            terms[count][0] = coeff;
            terms[count][1] = power;
            count++;

            if (flag == 0) {
                break;
            }
        }

        int scalar = sc.nextInt();

        // Print original polynomial
        for (int i = 0; i < count; i++) {
            System.out.print(terms[i][0] + "x^" + terms[i][1]);
            if (i < count - 1) System.out.print("+");
        }
        System.out.println();

        // Print multiplied polynomial
        for (int i = 0; i < count; i++) {
            System.out.print((terms[i][0] * scalar) + "x^" + terms[i][1]);
            if (i < count - 1) System.out.print("+");
        }
        System.out.println();
    }
}

