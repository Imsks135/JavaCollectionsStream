package org.collections.setexamples;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> list = new LinkedHashSet<>();
        list.add(1);
        list.add(15);
        list.add(9);
        Iterator<Integer> it = list.iterator();
        System.out.println("Using iterator");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Using for loop");
        for(Integer x :list){ // using enhance for loop
            System.out.println(x);
        }
    }
}
