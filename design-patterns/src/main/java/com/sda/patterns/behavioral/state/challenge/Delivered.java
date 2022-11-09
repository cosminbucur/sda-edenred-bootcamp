package com.sda.patterns.behavioral.state.challenge;

public class Delivered implements PackageState {

    private static Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(Context context) {
        System.out.println("delivery complete");
    }
}
