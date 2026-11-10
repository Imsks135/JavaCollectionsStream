package org.threadExample.customlock.semaphorelock;

public class SemaphoreLockMain {
    static void main() {
      SemaphoreSharedResource obj = new SemaphoreSharedResource();
      Thread t1 = new Thread(() -> {
          obj.producer();
      });
        Thread t2 = new Thread(() -> {
            obj.producer();
        });
        Thread t3 = new Thread(() -> {
            obj.producer();
        });
        Thread t4 = new Thread(() -> {
            obj.producer();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
