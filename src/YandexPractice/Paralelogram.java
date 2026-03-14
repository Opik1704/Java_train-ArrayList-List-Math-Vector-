package YandexPractice;
import java.util.Scanner;

public class Paralelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        while (n-- > 0) {
            long[] x = new long[4];
            long[] y = new long[4];

            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
            }

            boolean isPara = false;

            if (x[0] + x[1] == x[2] + x[3] && y[0] + y[1] == y[2] + y[3]) isPara = true;

            else if (x[0] + x[2] == x[1] + x[3] && y[0] + y[2] == y[1] + y[3]) isPara = true;

            else if (x[0] + x[3] == x[1] + x[2] && y[0] + y[3] == y[1] + y[2]) isPara = true;
            if (isPara) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}