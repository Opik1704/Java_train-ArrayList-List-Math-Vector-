package discretemath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static ArrayList<Integer> prime(int[] mas) {
        ArrayList<Integer> prime_list = new ArrayList<>();
        for(int i = 0;i < mas.length;i++) {
            if(isPrime(mas[i])) {
                prime_list.add(mas[i]);
            }
        }
        return prime_list;
    }
    public static List<Integer> getPrimesStream(int[] mas) {
        return Arrays.stream(mas)
                .filter(PrimeNumber::isPrimeFast)
                .boxed()
                .collect(Collectors.toList());
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeFast(int n){
        if (n == 2) return true;
        if(n < 2) return false;
        if (n % 2 == 0) return false;
        for(int i = 3;i <= Math.sqrt(n);i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
