package org.threadExample;

public class ProducerConsumer {
    public static void main(String[] args) {
        ProduceConsmerClass pcc = new ProduceConsmerClass();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    pcc.produce(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    pcc.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
