package org.multiThreading.ExplicitLock;


public class CustomThread implements Runnable{

   private Withdraw withdraw;

     CustomThread(Withdraw withdraw){
        this.withdraw=withdraw;
    }
    @Override
    public void run()  {
        System.out.println("Available Balance : "+withdraw.debit(5));
    }
}
