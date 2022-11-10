package com.sda.advanced.concurrency.synchronize.waitnotify;

// https://www.baeldung.com/java-wait-notify
// The Sender is supposed to send a data packet to the Receiver.
// The Receiver cannot process the data packet until the Sender finishes sending it.
// The Sender shouldn't attempt to send another packet unless the Receiver has already processed the previous packet.
public class DemoWaitNotify {

    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}
