package YandexPractice;

import java.io.*;

public class WaveCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        long[] l = new long[n];
        long[] r = new long[n];
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            l[i] = Long.parseLong(line[0]);
            r[i] = Long.parseLong(line[1]);
            x[i] = Long.parseLong(line[2]);
        }
        for(int i = 0;i < m;i++){
            String[] line = reader.readLine().split(" ");
            long q = Long.parseLong(line[0]);
            long totalHeight = 0;
            for(int j = 0;j < n;j++){
                if(q >= l[j] && q <= r[j]){
                    long dist = q - l[j];
                    if(dist % 2 == 0){
                        totalHeight = totalHeight + x[j];
                    }
                    else{
                        totalHeight = totalHeight - x[j];
                    }
                }
            }
            System.out.println(totalHeight);
        }
        reader.close();
        writer.close();
    }
}
