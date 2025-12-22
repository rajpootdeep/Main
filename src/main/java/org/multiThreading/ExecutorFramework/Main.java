package org.multiThreading.ExecutorFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FileProcessor fileProcessor = new
                FileProcessor();
        List<String> files = Arrays.asList("File 1", "File 2", "File 3", "File 4", "File 5", "File 6", "File 0");
        System.out.println("File processing starting... ");
        fileProcessor.processFiles(files);

        System.out.println("All file processing done ! ");
    }

}
