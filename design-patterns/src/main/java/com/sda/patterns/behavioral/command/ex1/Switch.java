package com.sda.patterns.behavioral.command.ex1;

// invoker
public class Switch {

    private final Command up;
    private final Command down;

    public Switch(Command up, Command down) {
        // concrete Command registers itself with the invoker
        this.up = up;
        this.down = down;
    }

    // invoker calls concrete Command, which executes the Command on the receiver
    void flipUp() {
        up.execute();
    }

    void flipDown() {
        down.execute();
    }
}
