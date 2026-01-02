package org.multiThreading.countDownLatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class DependentService implements Callable<String> {

    CountDownLatch countDownLatch;
    public DependentService(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public String call() throws Exception{
        Thread.sleep(60000);
        System.out.println("Starting Service using thread  "+Thread.currentThread()+ "name of thread : "+Thread.currentThread().getName());
        countDownLatch.countDown();
        return "Service Completed!";
    }
}
