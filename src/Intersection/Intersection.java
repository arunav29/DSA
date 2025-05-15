package Intersection;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 4, 6};

        // Find intersection
        System.out.print("[");
        boolean first = true;  // To handle commas

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Print only if not printed before
                    if (!isPrinted(arr1, i)) {
                        if (!first) System.out.print(", ");
                        System.out.print(arr1[i]);
                        first = false;
                    }
                    break;
                }
            }
        }
        System.out.println("]");
    }

    // Helper method to check if arr[index] appeared before index in arr
    public static boolean isPrinted(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) {
                return true;
            }
        }
        return false;
    }
}

