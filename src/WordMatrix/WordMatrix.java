package WordMatrix;
import java.util.*;

public class WordMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first input: vertical word and coordinates
        String[] firstLine = sc.nextLine().split(" ");
        String vertical = firstLine[0];
        int startRow = Integer.parseInt(firstLine[1]);
        int startCol = Integer.parseInt(firstLine[2]);

        // Read second input: horizontal word
        String horizontal = sc.nextLine();

        // Initialize matrix
        char[][] matrix = new char[10][10];
        for (char[] row : matrix)
            Arrays.fill(row, '*');

        // Place vertical word
        for (int i = 0; i < vertical.length(); i++) {
            matrix[startRow + i][startCol] = vertical.charAt(i);
        }

        // Find common character and its positions in both words
        int commonRow = -1, commonCol = -1;
        int verticalIndex = -1, horizontalIndex = -1;

        outer:
        for (int i = 0; i < vertical.length(); i++) {
            for (int j = 0; j < horizontal.length(); j++) {
                if (vertical.charAt(i) == horizontal.charAt(j)) {
                    verticalIndex = i;
                    horizontalIndex = j;
                    break outer;
                }
            }
        }

        if (verticalIndex == -1) {
            System.out.println("No common character found.");
            return;
        }

        // Calculate the row for horizontal word using common char
        commonRow = startRow + verticalIndex;
        commonCol = startCol;

        // Place horizontal word
        for (int i = 0; i < horizontal.length(); i++) {
            matrix[commonRow][commonCol - horizontalIndex + i] = horizontal.charAt(i);
        }

        // Print the matrix
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

