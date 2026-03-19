package TbanhAlgorithms;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubstringReplace {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();

        int[] tCost = new int[n - 4];
        int[] sCost = new int[n - 4];

        for(int i = 0;i<= n - 5;i++){
            int currentTCost = 0;
            int currentSCost = 0;

            if (s.charAt(i) != 't') currentTCost++;
            if (s.charAt(i+1) != 'b') currentTCost++;
            if (s.charAt(i+2) != 'a') currentTCost++;
            if (s.charAt(i+3) != 'n') currentTCost++;
            if (s.charAt(i+4) != 'k') currentTCost++;

            if (s.charAt(i) != 's') currentSCost++;
            if (s.charAt(i+1) != 't') currentSCost++;
            if (s.charAt(i+2) != 'u') currentSCost++;
            if (s.charAt(i+3) != 'd') currentSCost++;
            if (s.charAt(i+4) != 'y') currentSCost++;

            tCost[i] = currentTCost;
            sCost[i] = currentSCost;
        }

        int[] suffT = new int[n - 4];
        int[] suffS = new int[n - 4];
        suffT[n - 5] = tCost[n - 5];
        suffS[n - 5] = sCost[n - 5];

        for (int i = n - 6; i >= 0; i--) {
            suffT[i] = Math.min(suffT[i + 1], tCost[i]);
            suffS[i] = Math.min(suffS[i + 1], sCost[i]);
        }

        int minResult = 10;

        for (int i = 0; i <= n - 10; i++) {
            minResult = Math.min(minResult, tCost[i] + suffS[i + 5]);
            minResult = Math.min(minResult, sCost[i] + suffT[i + 5]);
        }

        System.out.println(minResult);
    }
}
