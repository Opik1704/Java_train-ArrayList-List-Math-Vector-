package YandexPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DecodeString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = reader.readLine();

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            if(s.charAt(i) == '#'){
                int num = Integer.parseInt(s.substring(i-2,i));
                result.append((char)('a' + num - 1));
                i -= 3;
            }
            else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));

                i -= 1;
            }
        }
        System.out.println(result.reverse().toString());
        reader.close();
        writer.close();
    }
}