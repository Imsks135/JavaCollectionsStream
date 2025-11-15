package org.collections.listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,10);
        list1.add(1,20);
        list1.add(2,30);
        System.out.println("List1 elements:");
        list1.forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0,40);
        list2.add(1,50);
        list2.add(2,60);
        System.out.println("List2 elements:");
        list2.forEach(System.out::println);

        list1.addAll(3,list2);
        System.out.println("List1+List2 elements:");
        list1.forEach(System.out::println);

        list1.replaceAll((Integer x)-> -1 * x);
        System.out.println("List1 elements are multiply with -1:");
        list1.forEach(System.out::println);

        list1.sort((Integer x, Integer y)-> x-y);
        System.out.println("List1 element are sorted in increasing order:");
        list1.forEach(System.out::println);

        list1.remove(0);
        System.out.println("List1 elements are removing 1st element:");
        list1.forEach(System.out::println);

        System.out.println("Index of -50 in list1 is: "+ list1.indexOf(-50));

        System.out.println("Iterating from forward:");
        ListIterator<Integer> listIterator = list1.listIterator();
        while(listIterator.hasNext()){
            int val = listIterator.next();
            System.out.println(val + " Next index "+ listIterator.nextIndex()+" "+"Previous index "+ listIterator.previousIndex());
        }
        System.out.println("Iterating from backward:");
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
        while(listIterator1.hasPrevious()){
            int val = listIterator1.previous();
            System.out.println(+val + " Next index "+ listIterator1.nextIndex()+" Previous index "+ listIterator1.previousIndex());
        }
    }
}
