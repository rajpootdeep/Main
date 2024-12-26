package org.DesignPattern.Singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public synchronized static void main(String[] ar) throws CloneNotSupportedException {
//        System.out.println(TVSet.getTVSetInstance());
//        ExecutorService executorService= Executors.newFixedThreadPool(2);
//        executorService.execute(TVSet::getTVSetInstance);
//        executorService.execute(TVSet::getTVSetInstance);
        TVSet t=TVSet.getTVSetInstance();
        TVSet tt= t.clone();
    }
}
