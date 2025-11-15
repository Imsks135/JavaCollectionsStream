package org.collections.queueexample;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ArrayDequeThreadSafe {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> dq = new ConcurrentLinkedDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.forEach(System.out::println);
    }
}
