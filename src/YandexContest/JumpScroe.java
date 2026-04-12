package YandexContest;

import java.util.Scanner;

public class JumpScroe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        long[] x = new long[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextLong();
        }

        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        int[][] obsProbs = {{0, 0}, {1, 1}, {2, 3}, {4, 5}};

        long totalScore = 0;
        int jumpIdx = 0;

        for (int i = 0; i < n; i++) {

                long obsStart = a[i];
                int len = obsProbs[b[i]][0];
                int points = obsProbs[b[i]][1];
                long obsEnd = obsStart + len;

                if (i > 0) {
                    int prevLen = obsProbs[b[i - 1]][0];
                    if (obsStart <= a[i - 1] + prevLen) {
                        System.out.println(0);
                        return;
                    }
                }

            boolean succes = false;

            while (jumpIdx < m && x[jumpIdx] + y[jumpIdx] < obsEnd) {
                jumpIdx++;
            }
            for (int j = jumpIdx; j < m; j++) {
                if (x[j] > obsStart) {
                    break;
                }
                if (x[j] <= obsStart && (x[j] + y[j]) >= obsEnd) {
                    succes = true;
                    break;
                }
            }

            if (succes) {
                totalScore += points;
            } else {
                totalScore -= 1;
            }
        }
        System.out.println(Math.max(0,totalScore));
    }
}
