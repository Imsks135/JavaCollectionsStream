package org.threadExample;


public class ThreadCreation1 {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread();
        obj1.start();
        Thread obj2 = new Thread(new MyRunnable());
        obj2.start();
    }
}
