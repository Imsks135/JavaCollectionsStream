package org.threadExample;

public class DeadLockExample {
    public static void main(String[] args) {
        final ClassA a = new ClassA();
        final ClassB b = new ClassB();

        Thread t1 = new Thread(()->{
            synchronized (a){
                System.out.println("Thread1 lock A");
                synchronized (b){
                    System.out.println("Thread1 lock B");
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (b){
                System.out.println("Thread2 lock B");
                synchronized (a){
                    System.out.println("Thread lock A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
