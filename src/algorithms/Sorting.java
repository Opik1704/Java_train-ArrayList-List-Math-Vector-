package algorithms;

import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int[] mas) {
        if (mas.length == 0) return;
        for(int i = 0;i < mas.length;i++)
        {
            for(int j = 0; j < mas.length - i - 1;j++) {
                if(mas[j] > mas[j + 1]) {
                    int c = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = c;
                }
            }
        }
    }
    public static void quickSort(int[] mas,int low, int high) {
        if (mas.length == 0 || low >= high) return;

        int pivot = mas[low+(high - low)/2];

        int i = low;
        int j = high;
        while (i < j) {
            while (mas[i] < pivot) i++;
            while(mas[j] > pivot) j--;
            if(i <= j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }
        Sorting.quickSort(mas,low,j);
        Sorting.quickSort(mas,i,high);
    }
    public static void countingSort(int[] mas) {
        if (mas.length == 0) return;

        int max = Arrays.stream(mas).max().getAsInt();

        int[] count_mas = new int[max + 1];
        for(int i:mas) {
            count_mas[i]++;
        }
        int index = 0;
        for(int n = 0;n < count_mas.length;n++) {
            int count = count_mas[n];
            for(int j = 0 ;j < count;j++) {
                mas[index] = n;
                index++;
            }
        }
    }
}
