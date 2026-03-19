package TbanhAlgorithms;
import java.util.*;

public class BishopCount {
    public class Main {
        static long MOD = 1_000_000_007;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k > 2 * n - 1) { // Слишком много слонов, они точно будут бить друг друга
                System.out.println(0);
                return;
            }

            // Длины рядов для двух частей доски
            List<Integer> b1 = new ArrayList<>();
            List<Integer> b2 = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) b1.add(i); else b2.add(i);
            }
            for (int i = n - 1; i >= 1; i--) {
                if (i % 2 != 0) b1.add(i); else b2.add(i);
            }

            Collections.sort(b1);
            Collections.sort(b2);

            long[] dp1 = solve(b1, k);
            long[] dp2 = solve(b2, k);

            long ans = 0;
            for (int i = 0; i <= k; i++) {
                ans = (ans + dp1[i] * dp2[k - i]) % MOD;
            }
            System.out.println(ans);
        }

        static long[] solve(List<Integer> L, int k) {
            int n = L.size();
            long[][] dp = new long[n + 1][k + 1];
            dp[0][0] = 1;

            for (int i = 1; i <= n; i++) {
                int len = L.get(i - 1);
                for (int j = 0; j <= k; j++) {
                    // Не ставим слона
                    dp[i][j] = dp[i - 1][j];
                    // Ставим слона
                    if (j > 0 && len - (j - 1) > 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - 1] * (len - (j - 1))) % MOD;
                    }
                }
            }
            return dp[n];
        }
    }
}
