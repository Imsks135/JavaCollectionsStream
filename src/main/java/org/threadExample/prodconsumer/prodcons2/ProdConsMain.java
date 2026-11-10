package org.threadExample.prodconsumer.prodcons2;

public class ProdConsMain {
    static void main() {
        SharedResource resourceObj = new SharedResource();
        Thread producerThread = new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    resourceObj.addItem();
                }
        );
        Thread consumerThread = new Thread(() -> {
                    resourceObj.consumeItem();
                }
        );
        producerThread.start();
        consumerThread.start();
    }
}
