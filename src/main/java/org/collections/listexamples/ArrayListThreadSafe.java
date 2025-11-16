package org.collections.listexamples;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThreadSafe {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3,4);
        list.forEach(System.out::println);
    }
}
