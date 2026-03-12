package train;

import java.util.ArrayList;

public class ProstieChisla {
    public static ArrayList<Integer> prime(int[] mas) {
        ArrayList<Integer> prime_list = new ArrayList<>();
        for(int i = 0;i < mas.length;i++) {
            if(IsPrime(mas[i])) {
                prime_list.add(mas[i]);
            }
        }
        return prime_list;
    }
    public static boolean IsPrime(int n) {
        for(int i = 2; i < n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
