package com.sda.patterns.behavioral.state.ex1;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        context.setCurrentState(this);
        System.out.println("stopped");
    }

    public String toString() {
        return "stop state";
    }
}
