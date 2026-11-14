package org.threadExample.threadpoolexecuter;

import java.util.concurrent.*;

public class FutureCallableMain {
    static void main() {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // submit(Runnable task), Runnable didn't return anything
        Future<?> futureobj = poolExecutor.submit(() -> System.out.println("Task with Runnable Interface"));

        // submit(Callable task), Callable return some V value
        Future<Integer> futureobj1 = poolExecutor.submit(() -> {
            System.out.println("Task with Callable Interface");
            return 45;
        });

    }
}
