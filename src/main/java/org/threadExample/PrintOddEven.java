package org.threadExample;

public class PrintOddEven {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        Thread t1 = new Thread(() -> {
            try {
                np.printOdd();
            } catch( Exception e) {
                System.out.println(e.getMessage());
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                np.printEven();
            } catch( Exception e) {
                System.out.println(e.getMessage());
            }
        });
        t1.start();
        t2.start();
    }
}
