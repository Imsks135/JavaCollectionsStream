package org.threadExample;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProduceConsmerClass {
    int capacity = 5;
    Queue<Integer> q = new ArrayDeque<>();

    public synchronized void produce(int val) throws InterruptedException {
        while (q.size() == capacity) wait();
        q.add(val);
        System.out.println("Produced: " + val);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (q.isEmpty()) wait();
        int val = q.remove();
        System.out.println("Consumed: " + val);
        notify();
        return val;
    }
}
