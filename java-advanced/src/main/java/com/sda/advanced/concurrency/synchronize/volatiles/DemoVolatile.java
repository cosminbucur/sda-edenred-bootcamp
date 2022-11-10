package com.sda.advanced.concurrency.synchronize.volatiles;

public class DemoVolatile {

    // used to make classes thread safe (synchronize)
    // used to modify the value by different threads
    // read / write will be done from and to the main memory
//    private static volatile boolean sayHello = false;

    // changes made in one thread might not reflect immediately in other thread
    private static boolean sayHello = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (!sayHello) {
            }

            System.out.println("Hello World!");

            while (sayHello) {
            }

            System.out.println("Good Bye!");
        });

        thread.start();

        // main thread changes value
        Thread.sleep(1000);
        System.out.println("Say Hello..");
        sayHello = true;

        // main thread changes value
        Thread.sleep(1000);
        System.out.println("Say Bye..");
        sayHello = false;
    }
}
