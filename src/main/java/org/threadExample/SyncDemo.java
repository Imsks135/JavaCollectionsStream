package org.threadExample;

public class SyncDemo {
    public static void main(String[] args) throws Exception {
         Counter cnt = new Counter();
         Thread t1 = new Thread(
                 ()->{
                     for(int i =0;i<1000;i++) cnt.increment();
                 }
         );
         Thread t2 = new Thread(()->{
             for(int j =0;j<1000;j++) cnt.increment();
         });
         t1.start();
         t2.start();

         t1.join();
         t2.join();

        System.out.println("Total count is: "+cnt.getCount());
    }
}
