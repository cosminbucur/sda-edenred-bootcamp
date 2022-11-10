package com.sda.advanced.concurrency.synchronize.ex2;

// without sync: final count = less than 1000
// with sync: final count = 1000
public class SynchronizedCounter {

    private int count = 0;

    // TODO: synchronize this
    // Synchronized Method
    public synchronized void increment() {
        // obtain lock
        count = count + 1;
    }
    // release lock

    public int getCount() {
        return count;
    }
}
