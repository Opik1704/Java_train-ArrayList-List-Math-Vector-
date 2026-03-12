package discretemath;

public class delAndKrat {
    public static int gcd(int a,int b) {
        if(a == 0 || b == 0) {
            throw new IllegalArgumentException(
                    String.format("Аргументы не могут быть равны 0 (a: %d, b: %d)",a,b)
            );
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
    public static int gcdRecursive(int a,int b) {
        if(b == 0) {
            return a;
        }
        return gcdRecursive(b,a % b);
    }
    public static int lcmFastGCD(int a,int b) {
        if(a == 0 || b == 0) {
            throw new IllegalArgumentException(
                    String.format("Аргументы не могут быть равны нулю (a: %d, b: %d)", a, b)
            );
        }
        int lcm = Math.abs(a * b) / gcd(a,b);
        return lcm;
    }
    public static int lcm(int a,int b) {
        if(a == 0 || b == 0) {
            throw new IllegalArgumentException(
                    String.format("Аргументы не могут быть равны нулю (a: %d, b: %d)", a, b)
            );
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
