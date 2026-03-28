package YandexPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fold{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        String[] parts = line.trim().split("\\s+");
        if (parts.length < 4) return;

        long n = Long.parseLong(parts[0]);
        long m = Long.parseLong(parts[1]);
        long h = Long.parseLong(parts[2]);
        long w = Long.parseLong(parts[3]);

        long f1 = 0;
        long tn1 = n, tm1 = m;
        while (tn1 > h) {
            tn1 = (tn1 + 1) / 2;
            f1++;
        }
        while (tm1 > w) {
            tm1 = (tm1 + 1) / 2;
            f1++;
        }

        long f2 = 0;
        long tn2 = n, tm2 = m;
        while (tn2 > w) {
            tn2 = (tn2 + 1) / 2;
            f2++;
        }
        while (tm2 > h) {
            tm2 = (tm2 + 1) / 2;
            f2++;
        }

        System.out.println(Math.min(f1, f2));
    }
}
