package org.threadExample.threadpoolexecuter;

import java.util.concurrent.*;

public class FutureMainClass {
    static void main() {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // new thread will be created, and it will perform the task
        Future<?> futureObj = poolExecutor.submit(() -> {
            System.out.println("This is the task which thread will execute");
        });

        System.out.println(futureObj.isDone()); // now we will get the status of thread
    }
}
