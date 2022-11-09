package com.sda.patterns.behavioral.state.ex1;

public class PlayState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("playing...");
        context.setCurrentState(this);
    }

    public String toString() {
        return "play state";
    }
}
