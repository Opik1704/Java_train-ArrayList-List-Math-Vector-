package discretemath;

public class DivisorsFunctions {
    public static long countDivisors(long n) {
        long count = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long a = 0; // Счетчик степени
                while (n % i == 0) {
                    a++;
                    n /= i;
                }
                count *= (a + 1); // Умножаем результат на (степень + 1)
            }
        }
        if (n > 1) count *= 2;
        return count;
    }
    public static long sumDivisors(long n) {
        long totalSum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long pPow = 1;
                long pSum = 1;
                while (n % i == 0) {
                    pPow *= i;
                    pSum += pPow;
                    n /= i;
                }
                totalSum *= pSum;
            }
        }
        if (n > 1) totalSum *= (n + 1); // Если осталось простое p, его сумма это (1 + p)
        return totalSum;
    }
    public static long sumDivisorsPower(long n, int k) {
        if (n <= 0) return 0;
        long totalSum = 1;
        long temp = n;
        for (long i = 2; i * i <= temp; i++) {
            if (temp % i == 0) {
                long pk = (long) Math.pow(i, k);
                long pSum = 1;
                long pPow = 1;

                while (temp % i == 0) {
                    pPow *= pk;
                    pSum += pPow;
                    temp /= i;
                }
                totalSum *= pSum;
            }
        }
        if (temp > 1) {
            totalSum *= (Math.pow(temp, k) + 1);
        }
        return totalSum;
    }
}
