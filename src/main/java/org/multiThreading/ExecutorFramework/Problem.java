package org.multiThreading.ExecutorFramework;

public class Problem {

    /*public static void main(String[] args) {
        System.out.println("Starting Main...");
        Long startTime=System.currentTimeMillis();
        for(int i=1;i<10;i++){
            int result=factorial(i);
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println("Factorial of "+i+" : "+result);
        }

        System.out.println("Total Time Taken : "+(System.currentTimeMillis()-startTime));
    }*/
    /*public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Main...");
        Long startTime=System.currentTimeMillis();
        for(int i=1;i<10;i++){
            int finalI = i;
            Thread thread=new Thread(() -> {
                int result=factorial(finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Factorial of "+ finalI +" : "+result);
            });
thread.start();
thread.join();
        }

        System.out.println("Total Time Taken : "+(System.currentTimeMillis()-startTime));
    }*/

    /**
     * this main method is using nine thread for each factorial calculation.
     * this give faster execution due to multiple thread running.
     * first we are creating thread and starting it,
     * then after all start calling join to complete all worker thread  first before main thread
     *
     * @param args
     * @throws InterruptedException
     */


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Main...");
        long startTime=System.currentTimeMillis();
        Thread[] threads=new Thread[9];
        for(int i=1;i<10;i++){
            int finalI = i;
            threads[i-1]=new Thread(() -> {
                int result=factorial(finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Factorial of "+ finalI +" : "+result);
            });
            System.out.println("Thread   Created : "+i);
            threads[i-1].start();
//            threads[i-1].join();
        }

        for(Thread thread : threads){
//            thread.start();
            thread.join();
        }

        System.out.println("Total Time Taken : "+(System.currentTimeMillis()-startTime));
    }

    private static int factorial(int i)  {
        int t=1;
        while(i>0){
            t=t*i;
            i--;
        }

        return t;
    }
}
