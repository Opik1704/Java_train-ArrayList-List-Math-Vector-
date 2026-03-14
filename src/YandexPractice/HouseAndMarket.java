package YandexPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HouseAndMarket {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");

        List<Integer> shops = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            if ("2".equals(parts[i])) {
                shops.add(i);
            }
        }
        int maxDist = 0;
        for (int i = 0; i < parts.length; i++) {
            if ("1".equals(parts[i])) {
                int minToShop = Integer.MAX_VALUE;

                for (int shopPos : shops) {
                    int currentDist = Math.abs(i - shopPos);
                    if (currentDist < minToShop) {
                        minToShop = currentDist;
                    }
                }
                if (minToShop > maxDist) {
                    maxDist = minToShop;
                }
            }
        }
        System.out.println(maxDist);
        reader.close();

        reader.close();
        writer.close();
    }
}
