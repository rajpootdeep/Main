package org.thread;

public class DeadLock {
    public static void main(String arg[]) {

        // Deadlock
        String lock1 = "Deep";
        String lock2 = "Kumar";
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("lock acquired");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("lock acquired");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
