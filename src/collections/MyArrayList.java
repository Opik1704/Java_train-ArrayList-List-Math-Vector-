package collections;

import java.util.Collection;
import java.util.Arrays;


public class MyArrayList<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int size = 0;
    private int real_size = 0;

    public MyArrayList() {
        this.array = new Object[DEFAULT_SIZE];
        real_size = DEFAULT_SIZE;
    }
    public MyArrayList(int input_size){
        if(input_size < 0) {
            throw new IllegalArgumentException("Размер должен быть меньше 0:" + input_size);
        }
        this.array = new Object[input_size];
        real_size = input_size;

    }
    public MyArrayList(Collection<? extends T> input_array){
        if(input_array == null) {
            throw new NullPointerException("Не является коллекцией");
        }
        Object[] elements = input_array.toArray();
        if (array.length == 0) {
            this.array = new Object[input_array.size() + DEFAULT_SIZE];
            this.size = input_array.size();
            real_size = array.length;
        }
        else {
            this.array = Arrays.copyOf(elements, elements.length, Object[].class);
            this.size = input_array.size() + size;
            real_size = array.length;
        }
    }
    public int size() {
        return this.size;
    }

    public void add(T input_el) {
        System.out.println("ADD size" + size + " real_size " + real_size +" очень рил_size "+ array.length);
        if(size + 1 < real_size) {
            array[size] = input_el;
            this.size = size + 1;
        }
        else {
            increaseSize(size + 1);
            array[size] = input_el;
            this.size = size + 1;
        }

    }
    public void add(int index,T input_el) {
        System.out.println("ADD" + size + real_size + array.length);

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы диапазона" + index);
        }

        if(size + 1 < real_size) {
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = input_el;
            this.size = size + 1;

        }
        else {
            increaseSize(size + 1);
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = input_el;
            this.size = size + 1;

        }
    }
    public void addAll(int index, Collection<? extends T> input_collection) {
        System.out.println("ADD" + size + real_size+ array.length);

        if (input_collection.size() + size < real_size) {
            System.arraycopy(array,index,array,index + 1,size - input_collection.size());
            System.arraycopy(array, index, input_collection, size + input_collection.size(), size - input_collection.size());
        }
        else {
            increaseSize(input_collection.size() + size);
            System.arraycopy(array,index,array,index + 1,size - input_collection.size());
            System.arraycopy(array, index, input_collection, size + input_collection.size(), size - input_collection.size());
        }
    }
    public void increaseSize(int minSize) {
        int oldSize = array.length;
        int newSize = real_size + (oldSize >> 1);
        real_size += minSize;
        array = Arrays.copyOf(array,newSize);
        real_size = array.length;
    }

    public void set(int index,T input_el) {
        array[index] = input_el;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы диапазона" + index);
        }
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public boolean remove(Object o){
        for(int i = 0;i < size;i++) {
            if(o.equals(array[i])) {
                System.arraycopy(array,i - 1,array,i + 1,size);
                return true;
            }
        }
        return false;


    }
    public T remove(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы диапазона" + index);
        }
        T a = (T) array[index];

        System.arraycopy(array,index + 1,array,index,size -	index - 1);
        size--;

        return a;
    }
    public void clear() {
        for(int i = 0;i < size;i++) {
            array[i] = null;
        }
        size = 0;
    }
    public boolean contains(T el) {
        return indexOf(el) >= 0;
    }
    public int indexOf(T el) {
        for(int i = 0;i < size;i++) {
            if (el.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public MyArrayList<T> clone() {
        MyArrayList<T> clone_arr = new MyArrayList<T>();
        clone_arr.array = Arrays.copyOf(this.array, this.size);
        clone_arr.size = this.size; // ← ВАЖНО: установите размер!
        return clone_arr;
    }
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
