package train;

import java.io.IOException;

public class delAndKrat {
    public static int gcd(int a,int b) {
        if(a == 0 ) {
            System.out.println("Неверный аргумент a:" + a);
            return -1;
        }
        if(b == 0 ) {
            System.out.println("Неверный аргумент b:" + b);
            return -1;

        }
        int n1 = Math.abs(a);
        int n2 = Math.abs(b);
        while(n2 != 0) {
            int z = n1 % n2;
            n1 = n2;
            n2 = z;
        }
        return n1;
    }
    public static int gcd_recursive(int a,int b) {
        if(b == 0) {
            return a;
        }
        return gcd_recursive(b,a % b);
    }
    public static int lcm_gcd(int a,int b) {
        if(a == 0 ) {
            System.out.println("Неверный аргумент a:" + a);
            return -1;
        }
        if(b == 0 ) {
            System.out.println("Неверный аргумент b:" + b);
            return -1;
        }
        int lcm = Math.abs(a * b) / gcd(a,b);
        return lcm;
    }
    public static int lcm(int a,int b) {
        if(a == 0 ) {
            System.out.println("Неверный аргумент a:" + a);
            return -1;
        }
        if(b == 0 ) {
            System.out.println("Неверный аргумент b:" + b);
            return -1;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int lcm = Math.max(a,b);
        while( lcm % Math.min(a,b) != 0 ) {
            lcm += Math.max(a,b);
        }
        return lcm;
    }
}
