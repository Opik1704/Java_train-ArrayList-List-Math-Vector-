package train;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) {

        final int n = 10;
        int[] mas = new int[n];
        Random random = new Random();
        for(int i = 0;i< n;i++) {
            mas[i] = random.nextInt(1,10);
        }
        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        System.out.println("Len " + mas.length + "nnnn " + (mas.length - 1) );
        System.out.println(mas[mas.length - 1]) ;
        int max = 0;
        int min = 101;
        int sum = 0;
        for(int i = 0;i < n;i++)
            if (mas[i] < min)
                min = mas[i];
        for(int i = 0;i < n;i++)
            if (mas[i] > max)
                max = mas[i];
        for(int i = 0;i < n;i++)
            sum = sum + mas[i];
        int sred = sum / mas.length;
        for(int i = 0;i < n;i++)
            System.out.println(mas[i]);

        System.out.printf("min = %d, max = %d, sum = %d, length = %d, average = %d%n",
                min, max, sum, mas.length, sred);

        System.out.println("REVERSE");
        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        ReverseMas.reverse_mas(mas);
        System.out.println("REVERSEREVERSEREVERSEREVERSEREVERSEREVERSE");

        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        System.out.println("REVERSE");

        System.out.println("bbb");
        sorting.bubble_sort(mas);
        for(int i = 0;i < mas.length;i++) {
            System.out.println(mas[i]);
        }
        System.out.println("bbb");

        System.out.println("qqq");
        for(int i = 0;i< n;i++) {
            mas[i] = random.nextInt(1,10);
        }
        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        System.out.println("qqqccc");

        sorting.quick_sort(mas,0,mas.length - 1);

        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        System.out.println("qqq\n");

        System.out.println("cscs");

        for(int i = 0;i< n;i++) {
            mas[i] = random.nextInt(1,10);
        }
        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }
        System.out.println("cscscsmmmm");

        sorting.counting_sort(mas);

        for(int i = 0;i < n;i++) {
            System.out.println(i + " " + mas[i]);
        }

        System.out.println("cscs");


        ArrayList<Integer> prime = ProstieChisla.prime(mas);
        System.out.println(prime);

        System.out.println("ссссс\n");

        int[] res_rem_mas = Remove.remove(mas, 4);
        for(int i = 0;i < res_rem_mas.length;i++) {
            System.out.println(res_rem_mas[i]);
        }

        Vector vector1 = new Vector(3.5,4.5,5.0);
        Vector vector2 = new Vector(2.0,2.0,2.0);

        System.out.println(vector1.get_x());
        System.out.println(vector1.get_y());
        System.out.println(vector1.get_z());

        System.out.println(vector1.len());
        System.out.println(vector2.len());

        double sp = Vector.scalar_product(vector1,vector2);
        System.out.println(sp);

        Vector vp = Vector.vector_product(vector1,vector2);
        System.out.println(vp);

        double angle = 30;
        double vp2 = Vector.vector_product_len(vector1,vector2,angle);
        System.out.println(vp2);

        double cos_vp = Vector.cos_vector(vector1,vector2);
        System.out.println(cos_vp);

        Vector summ_vector = Vector.summa_vector(vector1,vector2);
        System.out.println(summ_vector);

        Vector razn_vector = Vector.raznost_vector(vector1,vector2);
        System.out.println(razn_vector);

        System.out.println("AAAAAAAAAAAA");

        Vector[] vectors = Vector.rand_vect(3);
        System.out.println(Arrays.toString(vectors));

//        System.out.println(scalar_product(vector1,vector2)); так неправильно
        System.out.println("NODNODNOD");

        System.out.println(delAndKrat.gcd(12,18));
        System.out.println(delAndKrat.gcd(18,18));
        System.out.println(delAndKrat.gcd(18,12));
        System.out.println(delAndKrat.gcd(1,1));

        System.out.println("Отрицательные пошли");

        System.out.println(delAndKrat.gcd(-12,-18));
        System.out.println(delAndKrat.gcd(18,-18));
        System.out.println(delAndKrat.gcd(18,-12));
        System.out.println(delAndKrat.gcd(1,-1));

        System.out.println("Ошибки пошли");

        System.out.println(delAndKrat.gcd(0,1));
        System.out.println(delAndKrat.gcd(1,0));
        System.out.println(delAndKrat.gcd(0,0));

        System.out.println("NODNODNOD_recursive");
        System.out.println(delAndKrat.gcd(12,18));
        System.out.println(delAndKrat.gcd(18,18));
        System.out.println(delAndKrat.gcd(18,12));
        System.out.println(delAndKrat.gcd(1,1));

        System.out.println("Отрицательные пошли рекурсивно");

        System.out.println(delAndKrat.gcd(-12,-18));
        System.out.println(delAndKrat.gcd(18,-18));
        System.out.println(delAndKrat.gcd(18,-12));
        System.out.println(delAndKrat.gcd(1,-1));



        System.out.println("NOKNOKNOK_gcd");

        System.out.println(delAndKrat.lcm_gcd(3,4));
        System.out.println(delAndKrat.lcm_gcd(4,3));
        System.out.println(delAndKrat.lcm_gcd(5,4));
        System.out.println(delAndKrat.lcm_gcd(1,1));

        System.out.println("Отрицательные пошли");

        System.out.println(delAndKrat.lcm_gcd(-3,4));
        System.out.println(delAndKrat.lcm_gcd(-4,3));
        System.out.println(delAndKrat.lcm_gcd(-5,-4));
        System.out.println(delAndKrat.lcm_gcd(1,-1));

        System.out.println("Ошибки пошли");
        System.out.println(delAndKrat.lcm_gcd(0,1));
        System.out.println(delAndKrat.lcm_gcd(1,0));
        System.out.println(delAndKrat.lcm_gcd(0,0));

        System.out.println("NOKNOKNOK");

        System.out.println(delAndKrat.lcm(3,4));
        System.out.println(delAndKrat.lcm(4,3));
        System.out.println(delAndKrat.lcm(5,4));
        System.out.println(delAndKrat.lcm(1,1));

        System.out.println("Отрицательные пошли 2");

        System.out.println(delAndKrat.lcm(-3,4));
        System.out.println(delAndKrat.lcm(-4,3));
        System.out.println(delAndKrat.lcm(-5,-4));
        System.out.println(delAndKrat.lcm(1,-1));

    }

}