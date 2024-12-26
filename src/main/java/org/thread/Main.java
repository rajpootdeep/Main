package org.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        created -> new > started(Ready to run)  < - > running > dead
//        sleeping, Blocked for join completion, Blocked for I/O ,
// [ waiting for notification -> Blocked for lock aquisition ]

//        yield() -> this method will advise jvm to move thread from running state to read to run state.

//preemptive, Tim sliced/Round Robbin

//      Starvation occurs when a thread is unable to gain access to a required resource

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Rammmmmmm");
            }
        });

        thread.start();
        thread.start();




       /* System.out.println("Main is starting...");
       Thread thread1=new Thread1("Thread1");
       //thread1.setDaemon(true);
       thread1.start();
//        Thread thread2=new Thread(new Thread2());
        Thread thread2=new Thread(() -> {
            for (int i=1;i<5;i++){
                System.out.println(Thread.currentThread() + "  :  "+i);
            }
        });
        thread2.start();
        System.out.println("Main is exiting...");*/


        // Stack
      /*  Stack stack = new Stack(5);
        new Thread(() -> {
            int counter = 0;
            while (++counter < 10)
                System.out.println("Pusshed:  " + stack.push(100));
        }, "pusher").start();

        new Thread(() -> {
            int counter = 0;
            while (++counter < 10)
                System.out.println("Popped :   " + stack.pop());
        }, "Popper").start();
        System.out.println("main end");*/



        /*//JOIN
        Thread thread=new Thread(() -> {
            System.out.println(Thread.currentThread());
        },"Our Thread");
            thread.start();
        thread.join(); // first this tread will complete it's execution
        System.out.println("main is exiting");*/

    }
}
