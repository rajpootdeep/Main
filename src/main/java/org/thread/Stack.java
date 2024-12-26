package org.thread;

public class Stack {
    private int[] array;
    private int stackTop;
    private final Object obj;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        obj=new Object();
    }

    public boolean isEmpety() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int element) {
        synchronized (obj){
            if (isFull()) return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e){

            }
            array[stackTop] =element;
            return true;
        }
    }
    public int pop(){
        synchronized(obj){
            if(isEmpety()) return Integer.MIN_VALUE;
            int obj=array[stackTop];
            try{Thread.sleep(1000);}catch (Exception e){}
            stackTop --;
            return obj;
        }
    }
}