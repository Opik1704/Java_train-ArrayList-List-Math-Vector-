package YandexPractice;

import java.io.*;

public class Domino {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().split(" ");
        int x = Integer.parseInt(firstLine[0]);
        int y = Integer.parseInt(firstLine[1]);

        char[][] table = new char[x][y];

        for (int i = 0; i < x; i++) {
            table[i] = reader.readLine().toCharArray();
        }

        long total = 0;
        for(int i = 0;i < x;i++){
            for(int j = 0;j < y;j++){
                if (table[i][j] == '.') {
                    if (j < y - 1 && table[i][j + 1] == '.') {
                        total++;
                    }
                    if (i < x - 1 && table[i + 1][j] == '.') {
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
        reader.close();
        writer.close();
    }
}
