package TbanhAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinZero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Arrays.sort(s);

        if (s[0] == '0') {
            for(int i = 1; i < s.length;i++){
                if(s[i] != '0'){
                    char temp = s[0];
                    s[0] = s[i];
                    s[i] = temp;break;
                }
            }
        }

        System.out.println(new String(s));
    }
}
