package org.threadExample.customlock.reenrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantSharedResource {

    public void producer(ReentrantLock lock){
//        System.out.println(Thread.currentThread().getName() + " trying lock with ID: @"
//                + Integer.toHexString(System.identityHashCode(lock)));
        try {
            lock.lock();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName()
                    + " [HoldCount: " + lock.getHoldCount() + "]");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("Lock release by : " + Thread.currentThread().getName());
        }
    }
}