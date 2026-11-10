package org.threadExample.monitorlock;

public class MonitorLockMain {
    static void main() {
         MonitorLockExample monitorLockExample = new MonitorLockExample();
         Thread t1 = new Thread(() -> monitorLockExample.task1());
         Thread t2 = new Thread(() -> monitorLockExample.task2());
         Thread t3 = new Thread(() -> monitorLockExample.task3());

         t1.start();
         t2.start();
         t3.start();
    }
}
