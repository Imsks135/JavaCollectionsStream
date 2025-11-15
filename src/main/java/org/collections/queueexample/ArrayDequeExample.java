package org.collections.queueexample;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // ArrayDeque as Deque
        ArrayDeque<Integer> arrd = new ArrayDeque<>();
        arrd.addFirst(2);
        arrd.addLast(6);
        arrd.addFirst(1);
        arrd.addLast(7);
        System.out.println("ArrayDeque element are:");
        arrd.forEach(System.out::println);
        System.out.println("Deque first removed element:"+arrd.pollFirst());
        System.out.println("Deque last removed element:"+arrd.pollLast());

        // ArrayDeque ad Queue FIFO
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(2);
        arrayDequeAsQueue.addLast(3);
        System.out.println("Queue elements are: ");
        arrayDequeAsQueue.forEach(System.out::println);
        System.out.println("Queue first enqueue element are: " + arrayDequeAsQueue.removeFirst());

        // ArrayDeque as Stack LIFO
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(4);
        arrayDequeAsStack.addFirst(3);
        arrayDequeAsStack.addFirst(2);
        arrayDequeAsStack.addFirst(1);
        System.out.println("Stack Elements are: ");
        arrayDequeAsStack.forEach(System.out::println);
        System.out.println("Stack top element: "+ arrayDequeAsStack.removeFirst());
    }
}
