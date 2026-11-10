package org.threadExample.customlock.semaphorelock;


import java.util.concurrent.Semaphore;

public class SemaphoreSharedResource {
    Semaphore lock = new Semaphore(2);
    public void producer(){
        try {
            lock.acquire();
            System.out.println("Semaphore lock acquire by: "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.release();
            System.out.println("Semaphore lock release by: "+ Thread.currentThread().getName());
        }

    }
}
