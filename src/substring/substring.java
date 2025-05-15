
package substring;
import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;

        // Check all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }

        // Print the result
        System.out.println(count);
    }
}
