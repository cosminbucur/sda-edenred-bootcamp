package com.sda.advanced.concurrency.deadlock.ex1;

public class ScanAndPrint implements Runnable {

    private final Printer printer;
    private final Scanner scanner;

    public ScanAndPrint(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        // do scanning and printing simultaneously
        // TODO: sync printer
        synchronized (scanner) {
            System.out.println("Thread " + Thread.currentThread().getName() + " acquired scanner");
            try {
                // do scanning work
                scanner.scan();
                Thread.sleep(1000);
                System.out.println("Thread " + Thread.currentThread().getName() + " finished scanning");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // print the documents already scanned
            System.out.println("Thread " + Thread.currentThread().getName() + " is waiting for printer");
            // TODO: sync scanner
            synchronized (printer) {
                printer.print();
                System.out.println("Thread " + Thread.currentThread().getName() + " is printing");
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " finished printing");
        }
    }
}
