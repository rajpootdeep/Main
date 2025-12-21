package org.multiThreading.ExplicitLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Withdraw withdraw=new Withdraw();
        Thread thread1=new Thread(new CustomThread(withdraw));
        Thread thread2 =new Thread(new CustomThread(withdraw));
        thread1.start();
        thread2.start();
    }
}
