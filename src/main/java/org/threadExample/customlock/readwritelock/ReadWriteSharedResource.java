package org.threadExample.customlock.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteSharedResource {
     public void produce(ReentrantReadWriteLock lock){
         try {
             lock.readLock().lock();
             System.out.println("Read lock acquired by: "+ Thread.currentThread().getName());
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         } finally {
             lock.readLock().unlock();
             System.out.println("Read lock release by: "+ Thread.currentThread().getName());
         }
     }

     public void consume(ReentrantReadWriteLock lock){
         try{
             lock.writeLock().lock();
             System.out.println("Write lock acquired by: "+ Thread.currentThread().getName());
         } catch (Exception e) {
             throw new RuntimeException(e);
         } finally {
             lock.writeLock().unlock();
             System.out.println("Write lock release by: "+ Thread.currentThread().getName());
         }
     }
}
