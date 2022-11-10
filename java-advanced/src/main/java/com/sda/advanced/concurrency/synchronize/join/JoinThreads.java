package com.sda.advanced.concurrency.synchronize.join;

public class JoinThreads implements Runnable {

    @Override
    public void run() {
        System.out.println(System.nanoTime() + " Current thread: " + Thread.currentThread().getName() + " START");

        if (Thread.currentThread().getName().equals("T1")) {
            try {
                System.out.println(System.nanoTime() + " Inside join condition");
                DemoJoin.t2.start();
                // TODO: enable this
//                DemoJoin.t2.join();     // stop t1 until t2 is finished
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(System.nanoTime() + " Current thread: " + Thread.currentThread().getName() + " END");
    }
}
