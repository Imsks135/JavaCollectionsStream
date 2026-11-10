package org.threadExample.customlock.reenrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {
    static void main() {
        ReentrantSharedResource obj1 = new ReentrantSharedResource();
        ReentrantLock lock = new ReentrantLock();
         Thread t1 = new Thread(() -> {
             obj1.producer(lock);
         });

         ReentrantSharedResource obj2 = new ReentrantSharedResource();
         Thread t2 = new Thread(() -> {
             obj2.producer(lock);
         });

         t1.start();
         t2.start();
    }
}
