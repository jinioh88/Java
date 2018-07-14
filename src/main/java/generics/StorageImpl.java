package generics;

import sun.tools.jconsole.Plotter;

import java.util.ArrayList;

public class StorageImpl<T> implements Storage<T> {

    private T[] array;

    public StorageImpl(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }
    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}

public static void printAll(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
    for(Unit u : list) {
        System.out.println(u);
    }
}

public static <T extends Product> void printAll(ArrayList<T> list,ArrayList<T> list2) {
    for(Unit u : list) {
        System.out.println(u);
    }
}