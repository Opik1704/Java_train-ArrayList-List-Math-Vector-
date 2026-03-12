package collections;

import java.util.List;
import java.util.Arrays;


public class MainArrayList {
    public static void main(String[] args) {

        MyArrayList<Integer> Alist1 = new MyArrayList<>();
        MyArrayList<Integer> Alist2 = new MyArrayList<>(2);

        List<Integer> list2 = Arrays.asList(1, 1, 2,4,6,71,15,8,10,9,9,11,9,9,9,9,9,9,9,9);
        MyArrayList<Integer> arrayList3 = new MyArrayList<>(list2);
        System.out.println(arrayList3);

        System.out.println("AAAA");
        System.out.println(Alist1);
        Alist1.add(10);
        System.out.println(Alist1);
        System.out.println("AAAA");
        Alist1.add(10);
        System.out.println(Alist1);
        System.out.println("AAAA");


        System.out.println(Alist1.size());

        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        Alist1.add(11);
        System.out.println(Alist1);

        System.out.println(Alist1.size());
        List<String> list = Arrays.asList("A", "B", "C");
        MyArrayList<String> arrayList1 = new MyArrayList<>(list);
        System.out.println(arrayList1 + "TUTA");

        MyArrayList<Integer> arrayList2 = new MyArrayList<>(list2);
        arrayList2.add(2294858);
        arrayList2.clear();
        System.out.println(arrayList2.isEmpty());

        System.out.println(arrayList2);

        System.out.println("TUTA2");

        Alist2.add(1);
        System.out.println(Alist1);
        System.out.println(Alist1);

        Alist2.add(2);
        Alist2.add(3);
        Alist2.add(4);
        Alist2.add(5);
        Alist2.add(2,1488);
        System.out.println(Alist2);
        MyArrayList<Integer> arrayList2_copy = Alist2.clone();
        System.out.println(arrayList2_copy);
        System.out.println(arrayList2_copy.indexOf(1488));
        System.out.println(arrayList2_copy.get(2));
        System.out.println(arrayList2_copy);
        System.out.println(arrayList2_copy);
        System.out.println(arrayList2_copy);

        arrayList2_copy.set(2,2);
        System.out.println(arrayList2_copy);
        System.out.println("AAA"+ arrayList2_copy);


        System.out.println(arrayList2_copy.remove(2));
        System.out.println(arrayList2_copy);
        System.out.println(arrayList2_copy.remove(2));
        System.out.println(arrayList2_copy);

//remove

    }
}
