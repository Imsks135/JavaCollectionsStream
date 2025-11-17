package org.threadExample;

public class NumberPrinter {
    int num = 1;
    int limit = 10;
    boolean isOdd = true;

    public synchronized void printOdd() throws InterruptedException {
        while (num <= limit) {
            while (!isOdd) wait();
            if (num > limit) return;
            System.out.println("Odd: " + num++);
            isOdd = false;
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= limit) {
            while (isOdd) wait();
            if (num > limit) return;
            System.out.println("Even: " + num++);
            isOdd = true;
            notify();
        }
    }
}
