package org.multiThreading.VirtualThread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Main {
    public static void task(){
        System.out.println("Start Task : "+ Thread.currentThread());
    }
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Runtime.getRuntime().availableProcessors());


        /*Thread.ofPlatform().start(Main::task);
        Thread platFormThread = Thread.ofPlatform().unstarted(Main::task);
        platFormThread.start();*/

       Thread virtualThread= Thread.ofVirtual().unstarted(Main::task);

       virtualThread.start();
//       virtualThread.setDaemon(false); // IllegalArgumentException - 'false' not legal for virtual threads
       virtualThread.join();



    }
}
