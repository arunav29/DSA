package MaxSubarraySumBasic;

public class MaxSubarraySumBasic {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Compare current element and (currentMax + current element)
            if (arr[i] > currentMax + arr[i]) {
                currentMax = arr[i];  // start new subarray here
            } else {
                currentMax = currentMax + arr[i];  // continue subarray
            }

            // Update maxSoFar if currentMax is greater
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }

        System.out.println(maxSoFar);
    }
}
