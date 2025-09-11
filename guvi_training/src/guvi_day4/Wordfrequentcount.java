
package guvi_day4;
import java.util.Arrays;

public class Wordfrequent {
    public static void main(String[] args) {
        String str = "java coding java";
        String[] word = str.split(" ");
        int n = word.length;
        System.out.println("Number of words: " + n);

        boolean visited1[] = new boolean[n];
        Arrays.fill(visited1, false);

        for (int i = 0; i < n; i++) {
            if (!visited1[i]) {
                int count = 1; // first occurrence
                visited1[i] = true;

                for (int j = i + 1; j < n; j++) {
                    if (word[i].equals(word[j])) {
                        visited1[j] = true;
                        count++;
                    }
                }

                // print count after finishing the inner loop
                System.out.println("Count of \"" + word[i] + "\" = " + count);
            }
        }
    }
}
