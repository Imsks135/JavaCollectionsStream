package org.threadExample.prodconsumer.prodcons2;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void addItem(){
        System.out.println("Producer thread inside addItem: "+ Thread.currentThread().getName());
        isItemAvailable = true;
        System.out.println("Producer thread executing notifyAll method: "+ Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumeItem: "+ Thread.currentThread().getName());
        while(!isItemAvailable){
            try {
                System.out.println("Consumer thread executing wait method: "+ Thread.currentThread().getName());
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer thread consumed item: "+ Thread.currentThread().getName());
        isItemAvailable = false;
    }
}
