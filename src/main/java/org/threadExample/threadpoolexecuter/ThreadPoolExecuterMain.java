package org.threadExample.threadpoolexecuter;

import java.util.concurrent.*;

public class ThreadPoolExecuterMain {
    static void main() {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // new thread will be created, and it will perform the task
        poolExecutor.submit(() -> {
            System.out.println("This is the task which thread will execute");
        });

        // main thread will continue processing
    }
}
