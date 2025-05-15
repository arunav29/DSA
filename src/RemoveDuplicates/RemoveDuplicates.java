package RemoveDuplicates;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4};
        int n = arr.length;
        
        if (n == 0) {
            System.out.println("[]");
            return;
        }
        
        int j = 0;  // Index of last unique element
        
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        
        // Print unique elements
        System.out.print("[");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i]);
            if (i != j) System.out.print(", ");
        }
        System.out.println("]");
    }
}
