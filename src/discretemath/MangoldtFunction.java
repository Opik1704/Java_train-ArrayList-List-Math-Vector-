package discretemath;

public class MangoldtFunction {
    public static double mangoldt(long n) {
        if (n <= 1) return 0;
        long d = -1;
        long temp = n;
        for (long i = 2; i * i <= temp; i++) {
            if (temp % i == 0) {
                d = i;
                while (temp % i == 0){
                    temp /= i;
                }
                break;
            }
        }
        if (d == -1) d = n;
        return (temp == 1) ? Math.log(d) : 0;
    }

}
