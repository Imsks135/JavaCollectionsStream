package org.collections.listexamples;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();// Thread Safe
        v.add(0,10);
        v.add(1,20);
        v.add(2,30);
        System.out.println("Vector elements are: ");
        v.forEach(System.out::println);
        System.out.println("first element " +v.get(0)+" Last element "+v.get(v.size()-1));
    }
}
