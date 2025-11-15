package org.collections.queueexample;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap by default
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a); max heap
        pq.offer(10);
        pq.offer(5);
        pq.offer(3);
        pq.offer(11);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
