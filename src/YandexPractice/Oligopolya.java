package YandexPractice;

import java.io.*;
import java.util.*;

public class Oligopolya {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nLine = reader.readLine();
        if (nLine == null) return;
        int n = Integer.parseInt(nLine.trim());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        if (n == 1) {
            System.out.println("1");
            return;
        }
        long[] prefixSum = new long[n];
        prefixSum[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }
        int[] results = new int[n];

        results[n - 1] = (a[n - 1] > a[0]) ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[0] && prefixSum[i] > a[i + 1] && results[i + 1] == 1) {
                results[i] = 1;
            } else {
                results[i] = 0;
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(results[i]);
            if (i < n - 1) output.append(" ");
        }
        System.out.println(output.toString());
    }
}