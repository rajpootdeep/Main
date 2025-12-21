package org.multiThreading.ExplicitLock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Withdraw {

    private static double currentBallance = 10.78d;
    private final Lock lock = new ReentrantLock();

    double debit(double amt) {

        if (lock.tryLock()) {
            try {
                if (currentBallance >= amt) {
                    Thread.sleep(2000);
                    currentBallance = currentBallance - amt;
                } else {
                    System.out.println("Balance is not enough to deduct...");
                }
            } catch (InterruptedException e) {

            } finally {
                lock.unlock();
            }
        }else {
            System.out.println(" Lock not avaialable , current thread "+Thread.currentThread().getName());
        }

        return currentBallance;
    }

    double credit(double amt) {
        currentBallance = currentBallance + amt;
        return currentBallance;
    }

}
