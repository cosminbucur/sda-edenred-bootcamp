package com.sda.advanced.concurrency.synchronize.yield;

// without yield -> START END START END
// with yield -> START END
public class YieldRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Current thread" + Thread.currentThread().getName() + " priority " + Thread.currentThread().getPriority() + " START");

        // TODO: enable this
        // give thread with equal priority chance to run
        Thread.yield();

        System.out.println("Current thread" + Thread.currentThread().getName() + " priority " + Thread.currentThread().getPriority() + " END");
    }
}
