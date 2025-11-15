package org.collections.queueexample;

import java.util.concurrent.PriorityBlockingQueue;

public class ThreadSafePriorityQueue {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.forEach(System.out::println);
    }
}
