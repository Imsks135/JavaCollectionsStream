package org.threadExample.monitorlock;

public class MonitorLockExample {
    public synchronized void task1(){
        System.out.println("Task1 before sleep state: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000L);
            System.out.println("Task1 sleep state finished: "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void task2(){
        System.out.println("Task2 before synchronized block: "+ Thread.currentThread().getName());
        synchronized (this){
            System.out.println("Task2 inside synchronized block: "+ Thread.currentThread().getName());
        }
    }
    public void task3(){
        System.out.println("Task3: "+ Thread.currentThread().getName());
    }
}
