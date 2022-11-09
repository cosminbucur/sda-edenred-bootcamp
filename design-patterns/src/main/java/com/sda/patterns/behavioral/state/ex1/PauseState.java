package com.sda.patterns.behavioral.state.ex1;

public class PauseState implements State {

    @Override
    public void doAction(Context context) {
        context.setCurrentState(this);
        System.out.println("paused playing");
    }

    public String toString() {
        return "pause state";
    }
}
