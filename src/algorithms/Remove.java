package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Remove {
    public static int[] remove(int[] mas,int n) {
        int count = 0;
        for(int i = 0;i < mas.length;i++) {
            if (mas[i] == n) {
                count++;
            }
        }
        if(count == 0) return mas;
        else {
            int index = 0;
            int[] new_mas = new int[mas.length - count];
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] != n) {
                    new_mas[index] = mas[i];
                    index++;
                }
            }
            return new_mas;
        }
    }
    public static int[] removeByStreamApi(int[] mas,int n){
        return IntStream.rangeClosed(1, mas.length).map(i -> mas[mas.length - i]).toArray();
    }
}
