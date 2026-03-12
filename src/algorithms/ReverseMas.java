package algorithms;

import java.util.Arrays;
import java.util.Collections;

public class ReverseMas {
    public static void reverseList(int[] mas) {
        int start = 0;
        int end = mas.length - 1;
        System.out.println("R");
        while(start < end) {
            int c = mas[start];
            mas[start] = mas[end];
            mas[end] = c;
            start++;
            end--;
        }

    }
    public static void reverseListByStreamApi(int[] mas){
        return Collections.reverse(mas);
    }
}
