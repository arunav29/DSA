package WordChain;

import java.util.Scanner;

public class WordChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] words = new String[n];
        boolean[] used = new boolean[n];

        // Read input words
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // The first word is fixed
        String[] result = new String[n];
        result[0] = words[0];
        used[0] = true;

        for (int i = 1; i < n; i++) {
            String prev = result[i - 1];
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    int overlap = getOverlap(prev, words[j]);
                    if (overlap >= 3) {
                        result[i] = words[j];
                        used[j] = true;
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("IMPOSSIBLE");
                return;
            }
        }

        // Print chained words
        for (String word : result) {
            System.out.println(word);
        }
    }

    // Get the overlap length between the end of word1 and start of word2
    static int getOverlap(String word1, String word2) {
        int maxOverlap = Math.min(word1.length(), word2.length());
        for (int len = maxOverlap; len >= 3; len--) {
            if (word1.endsWith(word2.substring(0, len))) {
                return len;
            }
        }
        return 0;
    }
}
