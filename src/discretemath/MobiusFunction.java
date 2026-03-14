package discretemath;

public class MobiusFunction {
    public static int mobius(int n){
        if(n == 0){
            throw new IllegalArgumentException("n должно быть больше нуля");
        }
        if(n == 1) return 1;

        int temp = n;
        int count = 0;
        for(int i =1; i * i <= temp;i++){
            if(temp % i == 0){
                count++;
                temp /= i;
            }
            if(temp % i == 0) {
                return 0;
            }
        }
        if(temp > 1){
            count++;
        }
        return (count % 2 == 1) ? -1 : 1;
    }
}
