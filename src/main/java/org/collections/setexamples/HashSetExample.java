package org.collections.setexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
//        set1.add(3); no duplicates are stored in HashSet
        System.out.println("Set1 elements are:");
        set1.forEach(System.out::println);

        Set<Integer> set2 = new HashSet<>(0);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Set2 elements are:");
        set2.forEach(System.out::println);

        set1.addAll(set2);
        System.out.println("Set1 and Set2 after union:");
        set1.forEach(System.out::println);

        set1 = new HashSet<>();
        set1.add(7);
        set1.add(8);
        set1.add(9);

        set2 = new HashSet<>();
        set2.add(8);
        set2.add(9);
        System.out.println("Set1 and Set2 Intersection:");
        set1.retainAll(set2);
        set1.forEach(System.out::println);

        set1 = new HashSet<>();
        set1.add(11);
        set1.add(23);
        set1.add(67);
        set1.add(87);
        System.out.println("Set1 elements are:");
        set1.forEach(System.out::println);

        set2 = new HashSet<>();
        set2.add(23);
        set2.add(87);
        System.out.println("Set2 elements are:");
        set2.forEach(System.out::println);

        set1.removeAll(set2);
        System.out.println("Set1 elements after Removing Set2 All elements:");
        set1.forEach(System.out::println);
    }
}
