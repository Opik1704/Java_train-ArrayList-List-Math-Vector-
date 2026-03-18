package YandexPractice;

import java.io.*;
import java.util.Scanner;

public class Frame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] table = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                table[i][j] = sc.nextInt();
            }
        }

        long total = 0;
        for(int i = 0;i < x;i++){
            for(int j = 0;j < y;j++){
                if(i == 0 || i == x - 1){
                    total += table[i][j];
                }
                else if(j == 0 || j == y - 1){
                    total += table[i][j];
                }
            }
        }
        System.out.println(total);

    }
}
