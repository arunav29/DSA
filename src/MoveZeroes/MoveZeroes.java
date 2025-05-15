package MoveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        
        int count = 0;  // Count of non-zero elements
        
        // Traverse the array. If element is non-zero, put it at 'count' index
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        
        // Now fill remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        
        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

