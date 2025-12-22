package org.multiThreading.ExecutorFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FileProcessor {


    ExecutorService exec = Executors.newFixedThreadPool(3);


    void processFiles(List<String> files) throws InterruptedException {
        System.out.println("processFiles method called... ");

        for(String file : files){
           exec.submit(() -> {
               System.out.println("Processing file : "+file+" using thread : "+Thread.currentThread().getName());
           });
           Thread.sleep(3000);
        }
        exec.shutdown();

    }



}