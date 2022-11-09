package com.sda.patterns.behavioral.templatemethod.ex1;

public class Client {

    public static void main(String[] args) {
        OrderTemplate onlineOrder = new OnlineOrder();
        onlineOrder.process();

        System.out.println("--");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.process();
    }
}
