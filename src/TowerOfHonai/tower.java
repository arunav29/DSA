package TowerOfHonai;

public class tower {
    // Recursive function to solve Tower of Hanoi with 3 poles
    static void hanoi3(int n, char source, char destination, char auxiliary) {
        if (n == 0) return;

        hanoi3(n - 1, source, auxiliary, destination);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        hanoi3(n - 1, auxiliary, destination, source);
    }

    // Recursive function to solve Tower of Hanoi with 4 poles
    static void hanoi4(int n, char source, char destination, char aux1, char aux2) {
        if (n == 0) return;

        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        // Choose optimal k (you can tweak this; for now use n-2 as heuristic)
        int k = n - 2;

        // Step 1: Move k discs to aux1 using all 4 rods
        hanoi4(k, source, aux1, aux2, destination);

        // Step 2: Move remaining (n-k) discs to destination using 3 rods
        hanoi3(n - k, source, destination, aux2);

        // Step 3: Move k discs from aux1 to destination using all 4 rods
        hanoi4(k, aux1, destination, source, aux2);
    }

    public static void main(String[] args) {
        int n = 4;  // You can change this to any number of discs

        System.out.println("Tower of Hanoi with 4 poles and " + n + " discs:");
        hanoi4(n, 'A', 'D', 'B', 'C');
    }

}
