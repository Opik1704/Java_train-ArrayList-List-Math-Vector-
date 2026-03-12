package train;

public class ReverseMas {
    public static void reverse_mas(int[] mas) {
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
}
