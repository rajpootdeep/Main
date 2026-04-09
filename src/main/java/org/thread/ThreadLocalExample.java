package org.thread;

public class ThreadLocalExample {
     static ThreadLocal<String> threadLocal = new ThreadLocal<>();
     static ThreadLocal<String> threadLocal1 = ThreadLocal.withInitial(()->"Default Value");
    public static void main(String[] args) {

        Runnable runnable = () -> {
            threadLocal.set(Thread.currentThread().getName());

            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){}
            System.out.println("Thread Name : "+Thread.currentThread().getName()+"Thraed local : "+threadLocal.get()+" threadLocal1 : "+threadLocal1.get());
//            threadLocal.remove();
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}