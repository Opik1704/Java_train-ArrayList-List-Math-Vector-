package YandexPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rebus {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        if (input == null) return;

        String[] parts = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String line : parts) {
            int countBefore = 0;
            int countAfter = 0;
            int n = line.length();

            int i = 0;
            while (i < n && line.charAt(i) == 39) {
                countBefore++;
                i++;
            }

            int j = n - 1;
            while (j >= i && line.charAt(j) == 39) {
                countAfter++;
                j--;
            }

            String word = line.substring(i, j + 1);

            String cutWord = word.substring(countBefore, word.length() - countAfter);
            result.append(cutWord);
        }

        System.out.println(result.toString());
        reader.close();
    }
}