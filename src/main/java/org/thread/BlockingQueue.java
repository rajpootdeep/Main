package org.thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public synchronized boolean add(int item) {
        while (q.size() == capacity) {
            try {
                q.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        q.add(item);
        q.notifyAll();
        return true;
    }

    public synchronized int remove() {
        while (q.isEmpty()) {
            try {
                q.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int ele = q.poll();
        q.notifyAll();
        return ele;
    }

}
