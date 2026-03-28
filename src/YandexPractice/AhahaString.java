package YandexPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class AhahaString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();
        int maxcount = 0;
        int count = 0;
        if(n == 1 && (s.charAt(0) == 'a' || s.charAt(0) == 'h') ){
            System.out.println(1);
            return;
        }
        for(int i = 0;i < n - 1;i++){
            char c = s.charAt(i);
            char v = s.charAt(i + 1);
            if((c == 'a' && v == 'h') || (c == 'h' && v =='a')){
                count++;
            }
            else {
                count = 0;
            }
            if(count +  1 > maxcount)
                maxcount = count + 1;
        }
        System.out.println(maxcount);


        reader.close();
        writer.close();
    }
}