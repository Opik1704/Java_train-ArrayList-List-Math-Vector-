package YandexPractice;

import java.util.Scanner;

public class RedBlue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLong()) return;
        long a = sc.nextLong(); // синие майки
        long b = sc.nextLong(); // красные майки
        long c = sc.nextLong(); // синие носки
        long d = sc.nextLong(); // красные носки

        long bestM = -1, bestN = -1;
        long minSum = Long.MAX_VALUE;

        if (a > 0 && c > 0) {
            long curM = b + 1;
            long curN = d + 1;
            if (curM + curN < minSum) {
                minSum = curM + curN;
                bestM = curM;
                bestN = curN;
            }
        }

        if (b > 0 && d > 0) {
            long curM = a + 1;
            long curN = c + 1;
            if (curM + curN < minSum) {
                minSum = curM + curN;
                bestM = curM;
                bestN = curN;
            }
        }
        if (a > 0 && b > 0) {
            long curM = Math.max(a, b) + 1;
            long curN = 1;
            if (curM + curN < minSum) {
                minSum = curM + curN;
                bestM = curM;
                bestN = curN;
            }
        }
        if (c > 0 && d > 0) {
            long curM = 1;
            long curN = Math.max(c, d) + 1;
            if (curM + curN < minSum) {
                minSum = curM + curN;
                bestM = curM;
                bestN = curN;
            }
        }
        System.out.println(bestM + " " + bestN);
    }
}