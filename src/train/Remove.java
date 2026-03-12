package train;

public class Remove {
    public static int[] remove(int[] mas,int n) {
        int count = 0;
        for(int i = 0;i < mas.length;i++) {
            if (mas[i] == n) {
                System.out.println("4");
                count++;
            }
        }
        System.out.printf("COUUUNT: %d%n", count);

        if(count == 0) return mas;

        else {
            int index = 0;
            int[] new_mas = new int[mas.length - count];
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] != n) {
                    new_mas[index] = mas[i];
                    index++;
                }
            }
            return new_mas;
        }
    }
}
