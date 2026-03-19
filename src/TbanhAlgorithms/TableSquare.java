package TbanhAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String s = br.readLine();
            if (s == null) break;

            long n = s.length();
            long maxK = 0;
            long currentK = 0;

            for (int i = 0; i < 2 * n; i++) {
                if (s.charAt((int)(i % n)) == '1') {
                    currentK++;
                    maxK = Math.max(maxK, currentK);
                } else {
                    currentK = 0;
                }
            }

            if (maxK > n) maxK = n;

            if (maxK == n) {
                System.out.println(n * n);
            } else if (maxK == 0) {
                System.out.println(0);
            } else {
                long side1 = (maxK + 1) / 2;
                long side2 = (maxK + 1) - side1;
                System.out.println(side1 * side2);
            }
        }
    }
}
