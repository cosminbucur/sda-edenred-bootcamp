package com.sda.patterns.behavioral.state.challenge;

public class Client {

    public static void main(String args[]) {
        Context context = new Context(null, "PAK123");

        context.update();
        context.update();
        context.update();
        context.update();
    }

}
