package org.multiThreading.countDownLatch;

import org.SOLID.LSP.C;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Main started...");

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch=new CountDownLatch(3);

        Future<String> f1=executorService.submit(new DependentService(countDownLatch));
        Future<String> f2=executorService.submit(new DependentService(countDownLatch));
        Future<String> f3=executorService.submit(new DependentService(countDownLatch));
        countDownLatch.await(5,TimeUnit.SECONDS);
        executorService.shutdown();

        System.out.println("Main ended...");

    }
}
