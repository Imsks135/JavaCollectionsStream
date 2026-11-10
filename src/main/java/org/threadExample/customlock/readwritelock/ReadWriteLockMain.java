package org.threadExample.customlock.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockMain {
    static void main() {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        //ReadWriteLock lock = new ReentrantReadWriteLock();
        ReadWriteSharedResource obj1 = new ReadWriteSharedResource();

       Thread t1 = new Thread(() -> {
           obj1.produce(lock);
       });
        Thread t2 = new Thread(() -> {
            obj1.produce(lock);
        });

        ReadWriteSharedResource obj2 = new ReadWriteSharedResource();
        Thread t3 = new Thread(() -> {
            obj2.consume(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
