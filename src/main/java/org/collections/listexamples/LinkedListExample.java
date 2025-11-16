package org.collections.listexamples;

import java.util.LinkedList;;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();// LinkedList as a deque
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        System.out.println("LinkedList as deque: ");
        list.forEach(System.out::println);
        System.out.println("First element: "+list.getFirst());

        // USING LIST FUNCTIONALITY
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(0,4);
        list1.add(1,6);
        list1.add(2,7);
        System.out.println("LinkedList as List: ");
        list1.forEach(System.out::println);

        list1.add(1,5);
        System.out.println(list1.get(0)+" "+list1.get(1)+" "+list1.get(2)+" "+list1.get(3));
    }
}
