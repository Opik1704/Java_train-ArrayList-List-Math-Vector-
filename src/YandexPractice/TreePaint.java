package YandexPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TreePaint {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int P = Integer.parseInt(parts[0]);
        int V = Integer.parseInt(parts[1]);
        String[] parts2 = reader.readLine().split(" ");
        int Q = Integer.parseInt(parts2[0]);
        int M = Integer.parseInt(parts2[1]);

        int a1 = P - V;
        int a2 = P + V;

        int b1 = Q - M;
        int b2 = Q + M;

        if(a2 < b1 || b2 < a1){
            System.out.println((a2 - a1 ) + (b2 - b1) + 2 );
        }
        else{
            System.out.println(Math.max(a2,b2) - Math.min(b1,a1) + 1);
        }
        reader.close();
        writer.close();
    }
}